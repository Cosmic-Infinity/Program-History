package library.services;

import library.models.Book;
import java.util.List;

public interface LibraryService {
    public void addBook(Book book);

    public void removeBook(String bookId);

    public void borrowBook(String userId, String bookId);

    public void returnBook(String userId, String bookId);
}
