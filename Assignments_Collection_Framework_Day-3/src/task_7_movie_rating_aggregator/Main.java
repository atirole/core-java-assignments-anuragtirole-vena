package task_7_movie_rating_aggregator;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        // Create a Map to store movie name -> list of ratings
        Map<String, List<Integer>> movieRatings = new HashMap<>();

        // Add ratings for some movies
        movieRatings.put("Movie A", Arrays.asList(5, 4, 4, 3, 5));
        movieRatings.put("Movie B", Arrays.asList(2, 3, 4, 3, 2));
        movieRatings.put("Movie C", Arrays.asList(4, 5, 4, 4, 4));
        movieRatings.put("Movie D", Arrays.asList(3, 2, 3, 2, 3));
        movieRatings.put("Movie E", Arrays.asList(5, 5, 5, 5, 5));

        // Create an instance of MovieRatingAggregator
        MovieRatingAggregator aggregator = new MovieRatingAggregator();

        // Sort movies by their average rating
        List<Map.Entry<String, List<Integer>>> sortedMovies = aggregator.sortMoviesByAverageRating(movieRatings);

        // Display movies and their average rating
        System.out.println("Movies sorted by average rating (descending):");
        for (Map.Entry<String, List<Integer>> entry : sortedMovies)
        {
            String movieName = entry.getKey();
            List<Integer> ratings = entry.getValue();
            double avgRating = aggregator.calculateAverage(ratings);
            System.out.println(movieName + " = " + avgRating);
        }
    }
}
