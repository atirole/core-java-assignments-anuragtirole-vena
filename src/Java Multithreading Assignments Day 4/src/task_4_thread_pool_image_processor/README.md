Description
This Java program simulates a parallel image processing pipeline using a fixed thread pool. 
It processes 50 image IDs (from 1 to 50), where each processing task takes approximately 100 milliseconds, 
and the results are printed in order using Callable and Future.

Features
Parallel Processing: Utilizes Java’s ExecutorService with a fixed thread pool of 5 threads 
to process images concurrently.

Simulated Workload: Each image task simulates a processing time by sleeping for 100 milliseconds.

Ordered Results: The results are collected and printed in sequential order (Image 1 to Image 50), 
regardless of the thread execution order.

Execution Time Measurement: The total processing time is measured and printed after 
all images have been processed.

Program Structure
ImageProcessor: Contains the logic to submit image processing tasks and return the ordered results.

Main: Acts as the entry point to run the image processing simulation and print the final output.

Output
Example:

Image 1 processed
Image 2 processed
...
Image 50 processed
Total execution time: 1013 ms
The total time varies depending on system performance and thread scheduling, 
but remains significantly lower than sequential execution due to parallelism.

