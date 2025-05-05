package task_1_multi_threaded_logging_system;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Logger logger = new Logger(false); // Set true to enable file-based logging

        int threadCount = 100;
        int messagesPerThread = 100;

        ExecutorService executor = Executors.newFixedThreadPool(threadCount);

        for (int i = 0; i < threadCount; i++)
        {
            int threadId = i;
            executor.submit(() -> {
                for (int j = 0; j < messagesPerThread; j++)
                {
                    logger.log("Thread-" + threadId + " Message-" + j, LogLevel.INFO);
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);

        logger.shutdown();
        System.out.println("All logs flushed and logger shutdown.");
    }
}

