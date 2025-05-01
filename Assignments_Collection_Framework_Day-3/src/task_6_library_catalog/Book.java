package task_6_library_catalog;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private String category;  // Changed from genre to category

    public Book(String title, String author, int publicationYear, String category) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.category = category;  // Changed from genre to category
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getCategory() {  // Changed from getGenre() to getCategory()
        return category;
    }

    // Override equals and hashCode to prevent duplicates based on title, author, and publication year
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", category='" + category + '\'' +  // Changed from genre to category
                '}';
    }
}
