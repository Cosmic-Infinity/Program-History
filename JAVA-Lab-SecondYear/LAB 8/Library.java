/*
8. Design a `Library` class to manage a collection of books.
Implement exception handling for cases like trying to borrow a non-existent book,
trying to return a book that wasn't borrowed, or an over-borrowed limit.
 */

import java.util.*;

class Library {
    String[] books;
    boolean[] borrowedBooks;
    static final int borrowlimit = 3;
    int borrowedCount = 0;

    Library() {
        books = new String[] {"book1", "book2", "book3"};
        borrowedBooks = new boolean[books.length];
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner ob = new Scanner(System.in);
        try {
            System.out.println("Enter the book to borrow:");
            String bookToBorrow = ob.nextLine();
            library.borrowBook(bookToBorrow);

            System.out.println("Enter the book to return:");
            String bookToReturn = ob.nextLine();
            library.returnBook(bookToReturn);
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (BorrowLimitExceededException e) {
            System.out.println(e.getMessage());
        } catch (BookNotBorrowedException e) {
            System.out.println(e.getMessage());
        }
    }

    void borrowBook(String book) throws BookNotFoundException, BorrowLimitExceededException {
        int bookIndex = findBookIndex(book);
        if (bookIndex == -1) {
            throw new BookNotFoundException("The book '" + book + "' does not exist in the library.");
        }
        if (borrowedCount >= borrowlimit) {
            throw new BorrowLimitExceededException("Borrow limit exceeded. You can only borrow up to " + borrowlimit + " books.");
        }
        borrowedBooks[bookIndex] = true;
        borrowedCount++;
        System.out.println("You have borrowed: " + book);
    }

    void returnBook(String book) throws BookNotBorrowedException {
        int bookIndex = findBookIndex(book);
        if (bookIndex == -1 || !borrowedBooks[bookIndex]) {
            throw new BookNotBorrowedException(book + " was not borrowed.");
        }
        borrowedBooks[bookIndex] = false;
        borrowedCount--;
        System.out.println("Returned: " + book);
    }

    int findBookIndex(String book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {
                return i;
            }
        }
        return -1;
    }
}

class BookNotFoundException extends Exception {
    BookNotFoundException(String message) {
        super(message);
    }
}

class BorrowLimitExceededException extends Exception {
    BorrowLimitExceededException(String message) {
        super(message);
    }
}

class BookNotBorrowedException extends Exception {
    BookNotBorrowedException(String message) {
        super(message);
    }
}
