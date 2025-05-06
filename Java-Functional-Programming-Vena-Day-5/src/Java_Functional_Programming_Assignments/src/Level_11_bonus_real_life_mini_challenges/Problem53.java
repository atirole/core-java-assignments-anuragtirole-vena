package Level_11_bonus_real_life_mini_challenges;

// Problem 53: Find earliest and latest dates using custom comparator and stream operations.

import java.time.LocalDate;
import java.util.*;

public class Problem53
{
    public static void main(String[] args)
    {
        List<LocalDate> dates = Arrays.asList(
                LocalDate.of(2022, 5, 10),
                LocalDate.of(2021, 3, 15),
                LocalDate.of(2024, 1, 1),
                LocalDate.of(2023, 8, 8) );

        // Using Comparator.naturalOrder() for finding min and max
        LocalDate earliest = dates.stream().min(Comparator.naturalOrder()).orElse(null);
        LocalDate latest = dates.stream().max(Comparator.naturalOrder()).orElse(null);

        System.out.println("Earliest: " + earliest);
        System.out.println("Latest: " + latest);
    }
}

