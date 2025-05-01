package task_5_product_catalog_system;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        // Create a TreeMap to store products with id as the key
        TreeMap<Integer, Product> productCatalog = new TreeMap<>();

        // Add products to the TreeMap
        productCatalog.put(1, new Product(1, "Product A", 29.99, 4.5, 100));
        productCatalog.put(2, new Product(2, "Product B", 19.99, 3.9, 150));
        productCatalog.put(3, new Product(3, "Product C", 49.99, 4.8, 50));
        productCatalog.put(4, new Product(4, "Product D", 15.99, 4.2, 200));
        productCatalog.put(5, new Product(5, "Product E", 9.99, 4.7, 120));

        // Create a List from the products in the TreeMap
        List<Product> sortedProducts = new ArrayList<>(productCatalog.values());

        // Sort products by rating (descending) and name (ascending) using a custom comparator
        sortedProducts.sort((p1, p2) -> {
            // First, compare by rating (descending order)
            int ratingComparison = Double.compare(p2.getRating(), p1.getRating());

            // If ratings are the same, compare by name (ascending order)
            if (ratingComparison == 0)
            {
                return p1.getName().compareTo(p2.getName());
            }

            return ratingComparison;
        });

        // Print sorted products
        System.out.println("Sorted Products by Rating (Descending) and Name (Ascending):");
        for (Product product : sortedProducts)
        {
            System.out.println(product);
        }
    }
}

