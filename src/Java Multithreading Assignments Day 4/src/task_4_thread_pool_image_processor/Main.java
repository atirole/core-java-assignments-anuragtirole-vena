package task_4_thread_pool_image_processor;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> processedImages = ImageProcessor.processImages(50);

        processedImages.forEach(System.out::println);
    }
}

