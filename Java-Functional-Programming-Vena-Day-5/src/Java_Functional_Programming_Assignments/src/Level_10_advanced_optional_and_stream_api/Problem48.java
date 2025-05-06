package Level_10_advanced_optional_and_stream_api;


// 50. Safely get the third element of a list using stream().skip(2).findFirst() and return Optional<T>.

import java.util.*;

public class Problem48
{
    public static void main(String[] args)
    {
        List<String> names = Arrays.asList("Anurag", "Vijay", "Sandeep", "Gopal");

        Optional<String> thirdElement = names.stream()
                .skip(2)
                .findFirst();

        thirdElement.ifPresent(System.out::println);
    }
}

