package task_1_multi_threaded_logging_system;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogEntry
{
    private final String message;
    private final LogLevel level;
    private final String timestamp;

    public LogEntry(String message, LogLevel level)
    {
        this.message = message;
        this.level = level;
        this.timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
    }

    @Override
    public String toString()
    {
        return "[" + timestamp + "][" + level + "] " + message;
    }
}

