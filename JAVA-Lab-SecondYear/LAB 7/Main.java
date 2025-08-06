import library.models.Book;
import library.services.LibraryService;
import library.services.LibraryServiceImpl;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        LibraryServiceImpl service = new LibraryServiceImpl();

        Book book1 = new Book("1", "BOOK1", "Author1");
        Book book2 = new Book("2", "BOOK2", "Author2");

        service.addBook(book1);
        service.addBook(book2);
        service.borrowBook("user1111", "1");
        service.borrowBook("user2222", "1");
        service.returnBook("user1111", "1");
        service.returnBook("user2222", "1");

        List<Book> availableBooks = service.getAvailableBooks();
        System.out.println("Available books:");
        for (Book book : availableBooks) {
            System.out.println(book.id+" "+book.title);
        }
    }
}
