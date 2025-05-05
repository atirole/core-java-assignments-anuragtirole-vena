package task_4_thread_pool_image_processor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ImageProcessor
{

    private static final int THREAD_POOL_SIZE = 5;

    public static List<String> processImages(int imageCount)
    {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        List<Future<String>> futures = new ArrayList<>();
        List<String> results = new ArrayList<>();

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= imageCount; i++)
        {
            final int imageId = i;
            Callable<String> task = () -> {
                Thread.sleep(100); // Simulate processing delay
                return "Image " + imageId + " processed";
            };
            futures.add(executor.submit(task));
        }

        for (Future<String> future : futures)
        {
            try
            {
                results.add(future.get());
            } catch (InterruptedException | ExecutionException e)
            {
                e.printStackTrace();
                results.add("Failed to process image");
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + " ms");

        executor.shutdown();
        return results;
    }
}

