package Level_2_stream_operations;
// Level 2 – Stream Operations (map, filter, collect)
import java.util.*;
import java.util.stream.*;

public class Main
{
    public static void main(String[] args)
    {
        // 8. Filter a list of integers to only even numbers.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Output 8");
        System.out.println(evenNumbers);

        // ----------------------------------------------------------
        // 9. Convert a list of strings to uppercase using map().
        List<String> words = Arrays.asList("anurag", "vijay", "sandeep", "mahesh");
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("\nOutput 9");
        System.out.println(upperCaseWords);

        // ----------------------------------------------------------
        // 10. Given a list of names, return a list of names longer than 4 characters.
        List<String> names = Arrays.asList("Anurag", "Vijay", "Sandeep", "Mahesh", "Ayushi");
        List<String> longNames = names.stream()
                .filter(name -> name.length() > 4)
                .collect(Collectors.toList());
        System.out.println("\nOutput 10");
        System.out.println(longNames);

        // ----------------------------------------------------------
        // 11. Count how many strings in a list start with “S”.
        List<String> nameList = Arrays.asList("Anurag", "Vijay", "Sandeep", "Mahesh", "Ayushi", "Gopal", "Sarthak");
        long countS = nameList.stream()
                .filter(name -> name.startsWith("S"))
                .count();
        System.out.println("\nOutput 11");
        System.out.println(countS);

        // ----------------------------------------------------------
        // 12. Find the longest string in a list using reduce().
        List<String> stringList = Arrays.asList("Anurag", "Vijay", "Sandeep", "Mahesh", "Ayushi", "Gopal", "Sarthak");
        String longestString = stringList.stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2)
                .orElse("No elements");
        System.out.println("\nOutput 12");
        System.out.println(longestString);

        // ----------------------------------------------------------
        // 13. Sort a list of integers in descending order using streams.
        List<Integer> integerList = Arrays.asList(5, 3, 8, 1, 2, 7);
        List<Integer> sortedDesc = integerList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("\nOutput 13");
        System.out.println(sortedDesc);

        // ----------------------------------------------------------
        // 14. Convert a list of integers into a list of their squares.
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = intList.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("\nOutput 14");
        System.out.println(squares);

        // ----------------------------------------------------------
        // 15. From a list of words, create a list of their lengths.
        List<String> wordsList = Arrays.asList("Anurag", "Vijay", "Sandeep", "Mahesh", "Ayushi", "Gopal", "Sarthak");
        List<Integer> lengths = wordsList.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("\nOutput 15");
        System.out.println(lengths);

        System.out.println("\nLevel 2 Completed");
    }
}
