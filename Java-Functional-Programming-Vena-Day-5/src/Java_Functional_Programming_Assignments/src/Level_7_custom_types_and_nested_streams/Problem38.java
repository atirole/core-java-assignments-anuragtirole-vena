package Level_7_custom_types_and_nested_streams;

// Problem38.java
// Given a list of products with category and rating, return a map of category → highest-rated product name.
import java.util.*;
import java.util.stream.*;

public class Problem38
{
    static class Product
    {
        private String name;
        private String category;
        private double rating;

        public Product(String name, String category, double rating)
        {
            this.name = name;
            this.category = category;
            this.rating = rating;
        }

        public String getName()
        {
            return name;
        }
        public String getCategory()
        {
            return category;
        }
        public double getRating()
        {
            return rating;
        }
    }

    public static void main(String[] args)
    {
        List<Product> products = Arrays.asList(
                new Product("Laptop", "Electronics", 4.5),
                new Product("Phone", "Electronics", 4.7),
                new Product("Shampoo", "Beauty", 4.2),
                new Product("Conditioner", "Beauty", 4.6)
        );

        Map<String, String> bestProductsByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(Product::getRating)),
                                optional -> optional.map(Product::getName).orElse("N/A")
                        )
                ));

        System.out.println("Best-rated products by category: " + bestProductsByCategory);
    }
}

