class Book {
    private String bookId;
    private String bookTitle;
    private boolean isIssued;

    private static int totalBooks = 0;
    private static int issuedBooks = 0;

    public Book(String bookId, String bookTitle) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.isIssued = false;
        totalBooks++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public static int getIssuedBooks() {
        return issuedBooks;
    }

    public boolean borrow() {
        if (!isIssued) {
            isIssued = true;
            issuedBooks++;
            System.out.println("Book borrowed successfully.");
            return true;
        } else {
            System.out.println("Book is already issued.");
            return false;
        }
    }

    public boolean returnBook() {
        if (isIssued) {
            isIssued = false;
            issuedBooks--;
            System.out.println("Book returned successfully.");
            return true;
        } else {
            System.out.println("Book was not issued.");
            return false;
        }
    }

    public String getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }
}

class Member {
    private String memberId;
    private String memberName;
    private int borrowedBooks;

    private static int totalMembers = 0;
    private static final int MAX_BORROW_LIMIT = 5;
    private static final int MAX_MEMBERS = 100;

    public Member(String memberId, String memberName) {
        if (totalMembers < MAX_MEMBERS) {
            this.memberId = memberId;
            this.memberName = memberName;
            this.borrowedBooks = 0;
            totalMembers++;
            System.out.println("Member created successfully.");
        } else {
            System.out.println("Maximum number of members reached. Cannot create new member.");
        }
    }

    public static int getTotalMembers() {
        return totalMembers;
    }

    public boolean borrowBook(Book book) {
        if (borrowedBooks < MAX_BORROW_LIMIT) {
            if (book.borrow()) {
                borrowedBooks++;
                System.out.println("Book borrowed by " + memberName);
                return true;
            } else {
                System.out.println("Failed to borrow book.");
                return false;
            }
        } else {
            System.out.println("Borrowing limit reached for " + memberName + ".");
            return false;
        }
    }

    public boolean returnBook(Book book) {
        if (borrowedBooks > 0) {
            if (book.returnBook()) {
                borrowedBooks--;
                System.out.println("Book returned by " + memberName);
                return true;
            } else {
                System.out.println("Failed to return book.");
                return false;
            }
        } else {
            System.out.println(memberName + " has no borrowed books to return.");
            return false;
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1 = new Book("B001", "Generic Book 1");
        Book book2 = new Book("B002", "Generic Book 2");

        Member member1 = new Member("M001", "Member 1");
        Member member2 = new Member("M002", "Member 2");

        member1.borrowBook(book1);
        member2.borrowBook(book2);

        member1.returnBook(book1);
        member2.returnBook(book2);

        System.out.println("Total Books: " + Book.getTotalBooks());
        System.out.println("Issued Books: " + Book.getIssuedBooks());
        System.out.println("Total Members: " + Member.getTotalMembers());
    }
}
