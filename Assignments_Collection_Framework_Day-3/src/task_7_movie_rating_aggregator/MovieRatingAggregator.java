package task_7_movie_rating_aggregator;

import java.util.*;

public class MovieRatingAggregator
{

    // Method to calculate the average rating for a movie
    public double calculateAverage(List<Integer> ratings)
    {
        int sum = 0;
        for (int rating : ratings)
        {
            sum += rating;
        }
        return (double) sum / ratings.size();
    }

    // Method to sort movies by average rating in descending order
    public List<Map.Entry<String, List<Integer>>> sortMoviesByAverageRating(Map<String, List<Integer>> movieRatings)
    {
        List<Map.Entry<String, List<Integer>>> movieList = new ArrayList<>(movieRatings.entrySet());

        // Sort the movie list based on average ratings in descending order
        movieList.sort((entry1, entry2) -> {
            double avg1 = calculateAverage(entry1.getValue());
            double avg2 = calculateAverage(entry2.getValue());
            return Double.compare(avg2, avg1);  // Sorting in descending order
        });

        return movieList;
    }
}

