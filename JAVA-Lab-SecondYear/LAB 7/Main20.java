/*

20. **Package Conflict Resolution:**
Create two packages: `com.example.a` with a class `Person` and `com.example.b`
 with another `Person` class. Write a program that uses both `Person` classes in
 the same class. Demonstrate how to resolve naming conflicts by using fully qualified names for each class.
*/
public class Main20 {
    public static void main(String[] args) {
        com.example.a.Person personA = new com.example.a.Person("Aman");
        com.example.b.Person personB = new com.example.b.Person(30);

        System.out.println("PersonA Name: " + personA.getName());
        System.out.println("PersonB Age: " + personB.getAge());
    }
}
