/*
2. **Method Overriding in Interfaces:**
Create an interface `Shape` with a method `draw()`.
 Implement this interface in two classes, `Circle` and `Square`.
 Override the `draw()` method differently in both classes 
 and show how method overriding works in interfaces.
*/

class Mains2{
    public static void main(String[] args){
        Shape s1 = new Circle();
        Shape s2 = new Square();
        s1.draw();
        s2.draw();
    }
}
interface Shape{
    public abstract void draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Drawing Circle.");
    }
}
class Square implements Shape{
    public void draw(){
        System.out.println("Drawing Square.");
    }
}