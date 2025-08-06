/*
8. **Interface with No Methods:**
Create an interface `Identifiable` with no methods.
Then, create a class `Person` that implements `Identifiable`.
Discuss the use case of having interfaces with no methods in real-world applications.
 */
class Mains8{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setID(12345);
        p1.setName("Person1");
        Person p2 = new Person();
        p2.setID(67890);
        p2.setName("Person2");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
interface Identifiable{}

class Person implements Identifiable{
    long id; String name;
    String getName() {return name;}

    long getID() {return id;}

    void setName(String name){this.name = name;}

    void setID(long id) {this.id = id;}

    public String toString() {
        return ("[ID = " +id+" ] "+ "Name: " +name);
    }
}

/*
Interfaces with no methods are often referred to as marker interfaces.
These interfaces do not define any behavior themselves
but are used to indicate that a class possesses certain properties
or belongs to a particular category.
The marker interface pattern is used for various purposes in real-world including - 
1. Type identification.
2. Code Readability and Documentation
3. Conditional Logic in Frameworks and Libraries

 */