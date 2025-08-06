package library.models;

public class Book {
    public String id;
    public String title;
    public String author;
    public boolean isAvailable;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // book is available by default
    }
}
