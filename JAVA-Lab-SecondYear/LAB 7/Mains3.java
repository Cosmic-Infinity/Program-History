/*
3. **Implementing an Interface in Abstract Class:**
Define an interface `Writable` with a method `write()`. 
Create an abstract class `Machine` that implements `Writable` but leaves `write()` abstract. 
Then, create a concrete class `Printer` that extends `Machine` and implements `write()`.
 Demonstrate how abstract classes can implement interfaces.
*/

class Mains3{
    public static void main(){
        Machine pt = new Printer();
        pt.write();
    }
}

interface Writable{
    public abstract void write();
}
abstract class Machine implements Writable{}

class Printer extends Machine{
    public void write(){
        System.out.println("Printer is Writing");
    }
}