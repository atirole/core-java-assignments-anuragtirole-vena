package Level_9_collectors_and_summarization;



// 45 Given a list of books, generate a summary object with total count, average rating, and total price.

import java.util.*;
import java.util.stream.*;

public class Problem45
{
    static class Book
    {
        private String title;
        private double price;
        private double rating;

        public Book(String title, double price, double rating)
        {
            this.title = title;
            this.price = price;
            this.rating = rating;
        }

        public double getPrice()
        {
            return price;
        }
        public double getRating()
        {
            return rating;
        }
    }

    public static void main(String[] args)
    {
        List<Book> books = Arrays.asList(
                new Book("Java Basics", 500, 4.5),
                new Book("Advanced Java", 700, 4.7),
                new Book("Spring Boot", 600, 4.6)
        );

        long count = books.size();
        double totalPrice = books.stream().mapToDouble(Book::getPrice).sum();
        double avgRating = books.stream().mapToDouble(Book::getRating).average().orElse(0.0);

        System.out.println("Total books: " + count);
        System.out.println("Total price: " + totalPrice);
        System.out.println("Average rating: " + avgRating);
    }
}


