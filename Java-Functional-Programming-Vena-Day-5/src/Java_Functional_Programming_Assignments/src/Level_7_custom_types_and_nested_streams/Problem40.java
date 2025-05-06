package Level_7_custom_types_and_nested_streams;

// Problem40.java
// Convert a CSV string of numbers ("1,2,3,4") into a List<Integer> using streams and lambdas.
import java.util.*;
import java.util.stream.*;

public class Problem40
{
    public static void main(String[] args)
    {
        String csv = "1,2,3,4,";

        List<Integer> numbers = Arrays.stream(csv.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println("Parsed numbers: " + numbers);
    }
}

