package Level_8_function_composition_and_pipelines;


// 42. Compose two functions: one for string parsing (String -> Integer) and one for doubling the number (Integer -> Integer)

import java.util.function.Function;

public class Problem42
{
    public static void main(String[] args)
    {
        Function<String, Integer> parse = Integer::parseInt;
        Function<Integer, Integer> doubleValue = x -> x * 2;

        // Compose: first parse string to int, then double the result
        Function<String, Integer> parseAndDouble = parse.andThen(doubleValue);

        String input = "21";
        System.out.println("Parsed and doubled: " + parseAndDouble.apply(input));
    }
}
