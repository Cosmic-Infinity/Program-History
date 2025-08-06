/*
   
**Default Package Use:**
Write a class `Main` in the default package (no package declaration) that uses another class `Person` from the `com.example` package. Demonstrate potential issues when mixing default packages and named packages.
*/



public class Main14 {
    public static void main(String[] args) {
        com.example.Person person = new com.example.Person("Alice");
        person.displayInfo();
    }
}
