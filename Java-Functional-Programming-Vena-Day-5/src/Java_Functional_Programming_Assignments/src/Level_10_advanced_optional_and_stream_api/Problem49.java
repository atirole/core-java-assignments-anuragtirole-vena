package Level_10_advanced_optional_and_stream_api;

// Problem51.java
// Given a list of URLs (strings), use streams to validate them using a Predicate<String> and return only valid ones.

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Problem49
{
    public static void main(String[] args)
    {
        List<String> urls = Arrays.asList(
                "https://www.venasolutions.com/",
                "https://google.com",
                "ftp://invalid.com",
                "https://www.youtube.com/",
                "just-a-string",
                "https://openai.com"
        );

        Predicate<String> isValidUrl = url -> url.startsWith("http://") || url.startsWith("https://");

        List<String> validUrls = urls.stream()
                .filter(isValidUrl)
                .collect(Collectors.toList());

        validUrls.forEach(System.out::println);
    }
}

