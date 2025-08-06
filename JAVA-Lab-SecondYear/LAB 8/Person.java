/*
19. Design a `Person` class and create a `compareAge()` method that throws a custom exception
if two persons are of the same age. Handle this exception in the calling code.
 */

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void compareAge(Person p) throws SameAgeException {
        if (this.age == p.age) {
            throw new SameAgeException(this.name + " and " + p.name + " are of the same age.");
        } else if (this.age > p.age) {
            System.out.println(this.name + " is older than " + p.name + ".");
        } else {
            System.out.println(this.name + " is younger than " + p.name + ".");
        }
    }

    public static void main(String[] args) {
        try {
            Person p1 = new Person("A", 20);
            Person p2 = new Person("B", 30);
            Person p3 = new Person("C", 30);
            Person p4 = new Person("D", 40);
            p1.compareAge(p2);
            p3.compareAge(p4);
            p2.compareAge(p3);
        } catch (SameAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

class SameAgeException extends Exception {
    SameAgeException(String msg) {
        super(msg);
    }
}
