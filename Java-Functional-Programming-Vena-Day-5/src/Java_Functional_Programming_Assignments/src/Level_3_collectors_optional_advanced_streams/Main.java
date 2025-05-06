package Level_3_collectors_optional_advanced_streams;
// Level 3 – Collectors, Optional, Advanced Streams
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main
{
    public static void main(String[] args)
    {
        // 16. Group a list of names by their first letter using Collectors.groupingBy().
        List<String> names = Arrays.asList("Anurag", "Vijay", "Sandeep", "Mahesh", "Ayushi", "Gopal", "Sarthak");
        Map<Character, List<String>> groupedByFirstLetter = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println("\nOutput 16");
        System.out.println(groupedByFirstLetter);

        // ----------------------------------------------------------
        // 17. Partition a list of integers into even and odd using Collectors.partitioningBy().
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> partitioned = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("\nOutput 17");
        System.out.println(partitioned);

        // ----------------------------------------------------------
        // 18. Join a list of strings into a single comma-separated string.
        List<String> words = Arrays.asList("Anurag", "Vijay", "Sandeep", "Mahesh");
        String joinedString = words.stream()
                .collect(Collectors.joining(", "));
        System.out.println("\nOutput 18");
        System.out.println(joinedString);

        // ----------------------------------------------------------
        // 19. Find the first element in a list of integers that is divisible by 5 using findFirst().
        List<Integer> intList = Arrays.asList(1, 2, 3, 5, 6, 10, 15);
        Optional<Integer> firstDivisibleByFive = intList.stream()
                .filter(n -> n % 5 == 0)
                .findFirst();
        System.out.println("\nOutput 19");
        firstDivisibleByFive.ifPresent(System.out::println);

        // ----------------------------------------------------------
        // 20. Use Optional to safely get a value or return a default.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> result = list.stream().filter(n -> n > 5).findFirst();
        System.out.println("\nOutput 20");
        System.out.println(result.orElse(0));

        // ----------------------------------------------------------
        // 21. Convert a list of integers to a Set using Collectors.toSet().
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 3, 4);
        Set<Integer> uniqueNumbers = integerList.stream().collect(Collectors.toSet());

        System.out.println("\nOutput 21");
        System.out.println(uniqueNumbers);

        System.out.println("\nLevel 3 Completed");
    }
}
