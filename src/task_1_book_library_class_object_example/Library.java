package task_1_book_library_class_object_example;

import java.util.ArrayList;

public class Library
{
    ArrayList<Book> books = new ArrayList<>();

    void addBook(Book book)
    {
        books.add(book);
    }

    void searchByTitle(String title)
    {
        for (Book book : books)
        {
            if (book.title.equalsIgnoreCase(title))
            {
                System.out.println("Book Found:");
                book.printDetails();
                return;
            }
        }
        System.out.println("Book not found with title: " + title);
    }

    void showAllBooks()
    {
        if (books.isEmpty())
        {
            System.out.println("Library is empty.");
        } else
        {
            for (Book book : books)
            {
                book.printDetails();
            }
        }
    }
}
