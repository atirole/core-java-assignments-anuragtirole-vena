package task_1_multi_threaded_logging_system;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Logger
{
    private final BlockingQueue<LogEntry> logQueue = new LinkedBlockingQueue<>();
    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    private final AtomicBoolean isShutdown = new AtomicBoolean(false);
    private final boolean writeToFile;
    private final String filePath = "logs.txt";
    private BufferedWriter fileWriter;

    public Logger(boolean writeToFile)
    {
        this.writeToFile = writeToFile;
        if (writeToFile)
        {
            try
            {
                fileWriter = new BufferedWriter(new FileWriter(filePath, true));
            }
            catch (IOException e)
            {
                throw new RuntimeException("Failed to open log file", e);
            }
        }

        scheduler.scheduleAtFixedRate(this::flush, 5, 5, TimeUnit.SECONDS);
    }

    public void log(String message, LogLevel level)
    {
        if (isShutdown.get()) return;
        logQueue.offer(new LogEntry(message, level));
    }

    public void log(String message)
    {
        log(message, LogLevel.INFO);
    }

    private synchronized void flush()
    {
        try
        {
            while (!logQueue.isEmpty())
            {
                LogEntry entry = logQueue.poll();
                if (entry != null)
                {
                    if (writeToFile && fileWriter != null)
                    {
                        fileWriter.write(entry.toString());
                        fileWriter.newLine();
                    }
                    else
                    {
                        System.out.println(entry);
                    }
                }
            }

            if (writeToFile && fileWriter != null)
            {
                fileWriter.flush();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void shutdown()
    {
        isShutdown.set(true);
        scheduler.shutdown();
        try
        {
            scheduler.awaitTermination(6, TimeUnit.SECONDS);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        flush();
        if (writeToFile && fileWriter != null)
        {
            try
            {
                fileWriter.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}

