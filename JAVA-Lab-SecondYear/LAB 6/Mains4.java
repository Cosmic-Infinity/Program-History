/*
4. Implement a library system with a superclass `Publication` that includes `title` and `author` fields.
Subclasses `Book` and `Magazine` add unique attributes. 
Use upcasting to store all publications in an array and display their common details, 
accessing subclass-specific details through casting when required.
 */

class Mains4{
    public static void main(String[] args){
        Publication[] a = new Publication [3];
        a[0] = new Book("Book1", "Author1","12345");
        a[1] = new Book("Book2", "Author2","56789");
        a[2] = new Magazine("Publication1", "Author99","33333");
        for(int i=0; i<3; i++){
            System.out.print(a[i].title+"\nby "+a[i].author+"\nidentified by ");
            if (a[i] instanceof Book) {
                Book b = (Book) a[i];
                System.out.println("ISBN: " + b.isbn);
                System.out.println("-----------------");
            } 
            else if (a[i] instanceof Magazine) {
                Magazine m = (Magazine) a[i];
                System.out.println("ID: " + m.id);
            }
        }
    }
}
class Publication{
    String title, author;
    Publication(String t, String a){
        title = t; author = a;
    }
}
class Book extends Publication{
    String isbn;
    Book(String t, String a, String i){
        super(t, a);
        isbn = i;
    }
}
class Magazine extends Publication{
    String id;
    Magazine(String t, String a, String i){
        super(t, a);
        id = i;
    }
}