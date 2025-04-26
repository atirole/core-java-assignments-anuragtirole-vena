package task_1_book_library_class_object_example;

public class Book
{
    String title;
    String author;
    String ISBN;

    Book(String title, String author, String ISBN)
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    void printDetails()
    {
        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN  : " + ISBN);
        System.out.println("----------------------");
    }
}
