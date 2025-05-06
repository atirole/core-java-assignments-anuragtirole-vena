package Level_11_bonus_real_life_mini_challenges;

// Problem 52: Reusable method that filters a list using a Predicate and logs each filtered item.

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Problem52
{
    // Generic method that filters and logs passing elements
    public static <T> List<T> filterAndLog(List<T> list, Predicate<T> predicate)
    {
        return list.stream()
                .filter(item -> {
                    boolean result = predicate.test(item);
                    if (result) System.out.println("Passing: " + item); // Log passing item
                    return result;
                })
                .collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Anurag", "Ayushi", "Vijay", "Sarthak");

        // Filter names with length > 6
        List<String> result = filterAndLog(names, name -> name.length() > 6);
    }
}
