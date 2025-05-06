package Level_1_basics_assignmnets;
// Level 1 – Basics (Lambdas & Functional Interfaces)
import java.util.function.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        // 1. Write a Predicate<String> that returns true if a string starts with “A”.
        Predicate<String> startsWithA = string -> string.startsWith("A");
        System.out.println("Output 1");
        System.out.println(startsWithA.test("Sandeep"));
        System.out.println(startsWithA.test("Anurag"));

        // ----------------------------------------------------------
        // 2. Create a Function<String, Integer> that returns the length of a string.
        Function<String, Integer> lengthString = string -> string.length();
        System.out.println("\nOutput 2");
        System.out.println(lengthString.apply("Ram"));
        System.out.println(lengthString.apply("Sita"));

        // ----------------------------------------------------------
        // 3. Use a Consumer<String> to print a string in uppercase.
        Consumer<String> printUpperCase = string -> System.out.println(string.toUpperCase());
        System.out.println("\nOutput 3");
        printUpperCase.accept("vena");
        printUpperCase.accept("solutions");

        // ----------------------------------------------------------
        // 4. Write a Supplier<Double> that generates a random number.
        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("\nOutput 4");
        System.out.println(randomSupplier.get());

        // ----------------------------------------------------------
        // 5. Use a lambda expression to sort a list of strings alphabetically.
        List<String> names = new ArrayList<>(Arrays.asList("Sandeep", "Ram", "Anurag", "Vijay"));
        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("\nOutput 5");
        System.out.println(names);

        // ----------------------------------------------------------
        // 6. Create a BiFunction<Integer, Integer, Integer> that returns the sum.
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("\nOutput 6");
        System.out.println(add.apply(10, 20));

        // ----------------------------------------------------------
        // 7. Create a Runnable lambda that prints “Hello Functional Java”.
        Runnable hello = () -> System.out.println("Hello Functional Java");
        System.out.println("\nOutput 7");
        hello.run();

        System.out.println("\nLevel 1 Completed");
    }
}

