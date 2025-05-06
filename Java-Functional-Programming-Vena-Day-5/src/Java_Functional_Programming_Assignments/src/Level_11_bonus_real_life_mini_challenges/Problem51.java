package Level_11_bonus_real_life_mini_challenges;

// Problem 51: Text Analyzer - Count frequency of each word in a paragraph.

import java.util.*;
import java.util.stream.*;

public class Problem51
{
    public static void main(String[] args)
    {
        String paragraph = "Vena Solutions is a cloud-based financial planning and analysis software platform that combines the familiarity of Excel with centralized data and workflow automation. ";

        // Convert to lowercase, split by non-word characters, group by word and count frequency
        Map<String, Long> wordFrequency = Arrays.stream(paragraph.toLowerCase().split("\\W+"))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        wordFrequency.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}

