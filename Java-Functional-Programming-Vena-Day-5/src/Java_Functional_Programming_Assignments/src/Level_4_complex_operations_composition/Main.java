package Level_4_complex_operations_composition;
// Level 4 – Complex Operations and Composition
import java.util.*;
import java.util.stream.*;
import java.util.function.Function;
public class Main
{
    public static void main(String[] args)
    {
        // 22. Write a function that takes a list of strings and returns a map of word to its length.
        List<String> wordsList = Arrays.asList("Anurag", "Vijay", "Sandeep", "Mahesh");
        Map<String, Integer> wordToLength = wordsList.stream()
                .collect(Collectors.toMap(word -> word, String::length));
        System.out.println("\nOutput 22:");
        System.out.println(wordToLength);

        // ----------------------------------------------------------
        // 23. Compose two functions: one that converts string to uppercase and one that appends “!”.
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> appendExclamation = str -> str + "!";
        Function<String, String> composedFunction = toUpperCase.andThen(appendExclamation);

        System.out.println("\nOutput 23:");
        System.out.println(composedFunction.apply("hello"));

        // ----------------------------------------------------------
        // 24. Chain multiple stream operations: filter > map > sort > collect.
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> filteredSorted = stringList.stream()
                .filter(str -> str.length() > 5)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nOutput 24:");
        System.out.println(filteredSorted);

        // ----------------------------------------------------------
        // 25. Given a list of people (name, age), filter adults (age > 18) and collect names.
        class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        List<Person> people = Arrays.asList(
                new Person("Anurag", 22),
                new Person("Vijay", 17),
                new Person("Sandeep", 19),
                new Person("Mahesh", 15)
        );

        List<String> adultNames = people.stream()
                .filter(person -> person.age > 18)
                .map(person -> person.name)
                .collect(Collectors.toList());

        System.out.println("\nOutput 25:");
        System.out.println(adultNames);

        // ----------------------------------------------------------
        // 26. From a list of words, remove duplicates and return sorted result.
        List<String> words = Arrays.asList("Anurag", "Vijay", "Sandeep", "Mahesh", "Vijay", "Sarthak", "Anurag");
        List<String> sortedUniqueWords = words.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nOutput 26:");
        System.out.println(sortedUniqueWords);

        // ----------------------------------------------------------
        // 27. Compute the average length of strings in a list.
        List<String> stringListForAverage = Arrays.asList("apple", "banana", "cherry");
        OptionalDouble averageLength = stringListForAverage.stream()
                .mapToInt(String::length)
                .average();

        System.out.println("\nOutput 27:");
        System.out.println(averageLength.orElse(0));

        // ----------------------------------------------------------
        // 28. Find the product of all even numbers in a list using reduce().
        List<Integer> intListForProduct = Arrays.asList(1, 2, 3, 4, 5, 6);
        Optional<Integer> product = intListForProduct.stream()
                .filter(n -> n % 2 == 0)
                .reduce((a, b) -> a * b);

        System.out.println("\nOutput 28:");
        System.out.println(product.orElse(1));

        System.out.println("\nLevel 4 Completed");
    }
}
