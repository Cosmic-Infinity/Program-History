/*
10. **Interface as a Parameter Type:**
Define an interface `Readable` with method `read()`.
 Write a method `processReading(Readable r)` that accepts any `Readable` object
 and calls its `read()` method. 
 Then, create two classes `Book` and `Newspaper` that implement `Readable`,
 and pass instances to `processReading()`.
*/

class Mains10 {
    public static void main(String[] args) {
        Readable r1 = new Book();
        Readable r2 = new Newspaper();
        Mains10 m = new Mains10();
        m.processReading(r1);
        m.processReading(r2);
    }
    void processReading(Readable r) {
        r.read();
    }
}
interface Readable {
    public abstract void read();
}
class Book implements Readable {
    public void read() {
        System.out.println("Reading Book");
    }
}
class Newspaper implements Readable {
    public void read() {
        System.out.println("Reading Newspaper");
    }
}