package Level_8_function_composition_and_pipelines;


// 41. Build a reusable pipeline of 3 functions: trim, lowercase, and remove punctuation from strings.

import java.util.function.Function;

public class Problem41
{
    public static void main(String[] args)
    {
        Function<String, String> trim = String::trim;
        Function<String, String> toLower = String::toLowerCase;
        Function<String, String> removePunctuation = s -> s.replaceAll("\\p{Punct}", "");

        // Composing all three into one reusable pipeline
        Function<String, String> cleanTextPipeline = trim.andThen(toLower).andThen(removePunctuation);

        String input = "  Hello, World! ";
        System.out.println("Processed String: " + cleanTextPipeline.apply(input));
    }
}
