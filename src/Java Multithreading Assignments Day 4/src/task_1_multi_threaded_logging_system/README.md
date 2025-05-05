Description
This project implements a high-throughput, multi-threaded logging system in Java. 
It is designed to simulate how logs from different parts of a system can be captured concurrently, 
stored in order, and periodically flushed to a destination (console or file).

Features
Thread-Safe Logging: Multiple threads can safely call the log(String message) method concurrently. 
Messages are stored in the order they are received using a BlockingQueue.

Asynchronous Flushing: A separate logging thread continuously flushes logs every 5 seconds to the configured 
output (console or file), simulating real-world disk or file-based logging.

Graceful Shutdown: The shutdown() method ensures all pending messages are 
flushed before stopping the logging thread cleanly.

Stress Simulation: The system simulates 100 threads, each logging 100 messages, 
ensuring message integrity and ordered processing.

Bonus Features:

Log Levels: Messages can be tagged as INFO, WARN, or ERROR.

Timestamps: Each log message includes a timestamp for tracking when it was logged.

File Logging Support: Logs can optionally be written to a logs.txt file instead of the console. 
This behavior is controlled by a configuration flag.

Program Structure
Logger: Core logging class. Handles concurrent log ingestion and background flushing.

LogMessage: A helper class that stores the message, log level, and timestamp.

Main: Simulates the system by spawning 100 threads that generate log messages. At the end, it calls shutdown() to flush and stop the logger.

Output
Messages appear in order and include timestamps and log levels, e.g.:

[2025-05-05 14:32:11] [INFO] Message from Thread-1: Log #1
[2025-05-05 14:32:11] [WARN] Message from Thread-2: Log #1
If file logging is enabled, output is saved in logs.txt located in the project root directory.

