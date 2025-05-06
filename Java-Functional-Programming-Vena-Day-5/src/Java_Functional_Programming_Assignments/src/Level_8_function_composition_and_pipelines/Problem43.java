package Level_8_function_composition_and_pipelines;


// 43. Write a generic method that accepts a List<T> and a Function<T, R> and applies the function to all elements.

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problem43
{
    public static <T, R> List<R> applyToAll(List<T> list, Function<T, R> function)
    {
        return list.stream()
                .map(function)
                .collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Sarthak", "Ayushi", "Gopal");

        // Example: map names to their lengths
        List<Integer> lengths = applyToAll(names, String::length);

        System.out.println("Name lengths: " + lengths);
    }
}
