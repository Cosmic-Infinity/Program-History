/*
13. Combine method overloading and overriding: Create a class `Library` 
with overloaded methods `addBook()` for adding books by `title`, `author`, or both.
 Create a subclass `DigitalLibrary` that overrides a method `searchBook()` 
 to support both physical and digital formats. 
 Demonstrate early binding through method overloading and late binding through overriding.
*/

class Mains13 {
    public static void main(String[] args) {
        Library physicalLibrary = new Library();
        DigitalLibrary digitalLibrary = new DigitalLibrary();

        physicalLibrary.addBook("ABC");
        physicalLibrary.addBook("1900", "Orwell");
        physicalLibrary.addBook("XYZ", "Scott", "physical");

        System.out.println("\n");

        physicalLibrary.searchBook("ABC");
        digitalLibrary.searchBook("ABC");
    }
}


class Library {
    void addBook(String title) {
        System.out.println("Adding book: " + title);
    }

    void addBook(String title, String author) {
        System.out.println("Adding book: " + title + " by author: " + author);
    }

    void addBook(String title, String author, String format) {
        System.out.println("Adding " + format + " book : " + title + " by author: " + author);
    }

    void searchBook(String title) {
        System.out.println("Searching for a physical book with title: " + title);
    }
}

class DigitalLibrary extends Library {
    void searchBook(String title) {
        System.out.println("Searching for a book : " + title + " in both physical and digital formats");
    }
}

