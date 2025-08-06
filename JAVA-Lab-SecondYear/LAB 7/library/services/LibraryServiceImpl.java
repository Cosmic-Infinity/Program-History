package library.services;

import library.models.Book;
import java.util.ArrayList;
import java.util.List;

public class LibraryServiceImpl implements LibraryService {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    public void removeBook(String bookId) {
        books.removeIf(book -> book.id.equals(bookId));
        System.out.println("Book removed: " + bookId);
    }

    public void borrowBook(String userId, String bookId) {
        for (Book book : books) {
            if (book.id.equals(bookId) && book.isAvailable) {
                book.isAvailable = false;
                System.out.println("Book borrowed by User " + userId + ": " + book.title);
                return;
            }
        }
        System.out.println("Book " + bookId + " is not available for borrowing.");
    }

    public void returnBook(String userId, String bookId) {
        for (Book book : books) {
            if (book.id.equals(bookId) && !book.isAvailable) {
                book.isAvailable = true;
                System.out.println("Book returned by User " + userId + ": " + book.title);
                return;
            }
        }
        System.out.println("Book " + bookId + " was not borrowed.");
    }

    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
}
