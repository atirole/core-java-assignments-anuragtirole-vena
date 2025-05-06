package Level_11_bonus_real_life_mini_challenges;

// Problem 54: Return the top 3 longest strings from a list using stream sorting.

import java.util.*;
import java.util.stream.*;

public class Problem54
{
    public static void main(String[] args)
    {
        List<String> words = Arrays.asList("Java", "Programming", "StreamAPI", "Lambda", "Function", "Optional");

        // Sort descending by string length and limit to top 3
        List<String> top3Longest = words.stream()
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .limit(3)
                .collect(Collectors.toList());

        top3Longest.forEach(System.out::println);
    }
}
