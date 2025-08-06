/*
1. **Interface with Multiple Methods:**
Define an interface `Vehicle` with methods `start()` and `stop()`.
 Create a class `Car` that implements `Vehicle` and provides its own implementation of both methods. 
 Then, create a class `Bicycle` that also implements `Vehicle` but provides a different implementation 
 for `start()` and `stop()`.
 Demonstrate how you can use polymorphism to call these methods.
*/
class Mains1{
    public static void main(){
        Vehicle v[] = new Vehicle[3];
        v[0] = new Car();
        v[1] = new Bicycle();
        
        v[0].start();
        v[1].start();
        v[0].stop();
        v[1].stop();
    }
}
interface Vehicle{
    public abstract void start();
    public abstract void stop();
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car STARTED");
    }
    public void stop(){
        System.out.println("Car STOPPED");
    }
}
class Bicycle implements Vehicle{
    public void start(){
        System.out.println("Bicycle is rolling");
    }
    public void stop(){
        System.out.println("Bicycle has stopped rolling");
    }
}