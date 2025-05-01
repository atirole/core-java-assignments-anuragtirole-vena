package task_6_library_catalog;

import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        // Create a Map to store books by category (instead of genre)
        Map<String, Set<Book>> libraryCatalog = new HashMap<>();

        // Create some book objects
        Book book1 = new Book("Book A", "Author 1", 2005, "Science Fiction");  //
        Book book2 = new Book("Book B", "Author 2", 2015, "Science Fiction");
        Book book3 = new Book("Book C", "Author 3", 2000, "Fantasy");
        Book book4 = new Book("Book A", "Author 1", 2005, "Science Fiction");  // Duplicate book
        Book book5 = new Book("Book D", "Author 4", 2010, "Fantasy");

        // Add books to the library catalog (grouped by category)
        libraryCatalog.putIfAbsent("Science Fiction", new HashSet<>());
        libraryCatalog.putIfAbsent("Fantasy", new HashSet<>());
        libraryCatalog.get("Science Fiction").add(book1);
        libraryCatalog.get("Science Fiction").add(book2);
        libraryCatalog.get("Science Fiction").add(book4);  // Duplicate will not be added
        libraryCatalog.get("Fantasy").add(book3);
        libraryCatalog.get("Fantasy").add(book5);

        // Print books in each category, sorted by publication year
        for (Map.Entry<String, Set<Book>> entry : libraryCatalog.entrySet())
        {
            String category = entry.getKey();  // Changed from genre to category
            Set<Book> books = entry.getValue();

            // Create a list from the set of books to sort
            List<Book> sortedBooks = new ArrayList<>(books);
            sortedBooks.sort(Comparator.comparingInt(Book::getPublicationYear));

            // Print the category and its books sorted by publication year
            System.out.println("Category: " + category);  // Changed from genre to category
            for (Book book : sortedBooks)
            {
                System.out.println(book);
            }
            System.out.println();
        }
    }
}
