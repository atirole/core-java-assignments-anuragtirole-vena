package Level_6_data_processing_and_ransformations;

// Problem33: Create a stream pipeline to flatten a list of lists of integers and return the distinct even numbers.
import java.util.*;
import java.util.stream.*;

public class Problem33
{
    public static void main(String[] args)
    {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(2, 4, 6),
                Arrays.asList(3, 6, 9, 10)
        );

        List<Integer> distinctEvens = listOfLists.stream()
                .flatMap(Collection::stream)             // flatten lists into one stream
                .filter(n -> n % 2 == 0)                // keep even numbers
                .distinct()                             // remove duplicates
                .collect(Collectors.toList());

        System.out.println("Distinct even numbers: " + distinctEvens);
    }
}

