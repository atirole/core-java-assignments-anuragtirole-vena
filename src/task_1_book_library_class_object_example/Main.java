package task_1_book_library_class_object_example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();
       
        lib.addBook(new Book("Java Basics", "James Gosling", "12345"));
        lib.addBook(new Book("Python Guide", "Guido van Rossum", "67890"));
        System.out.print("Books Present : Java Basics  :  Python Guide ");
        System.out.print("\nEnter book title to search about book details:");
        String searchTitle = sc.nextLine();

        lib.searchByTitle(searchTitle);

        System.out.println("\nAll Books in Library:");
        lib.showAllBooks();

        sc.close();
    }
}

