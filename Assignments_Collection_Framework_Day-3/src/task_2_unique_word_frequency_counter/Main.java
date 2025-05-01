package task_2_unique_word_frequency_counter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args)
    {
        String paragraph = "Vena was founded by finance professionals who recognized that better planning leads to better performance. Our journey began with a commitment to empower businesses through innovative FP&A solutions. Today, we are proud to support thousands of organizations to plan better and achieve more.";

        // Normalize the paragraph: remove punctuation, convert to lowercase
        paragraph = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split into words
        String[] words = paragraph.split("\\s+"); // Handles multiple spaces    // \\s+

        // Map to count frequency
        Map<String, Integer> frequencyMap = new HashMap<>();

        // TreeSet to store unique words alphabetically
        Set<String> uniqueWords = new TreeSet<>();

        for (String word : words)
        {
            uniqueWords.add(word);
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Output the results
        System.out.println("Number of unique words: " + uniqueWords.size());
        System.out.println("\nFrequencies of words:");

        for (String word : uniqueWords)
        {
            System.out.println(word + " = " + frequencyMap.get(word)  );
        }
    }
}