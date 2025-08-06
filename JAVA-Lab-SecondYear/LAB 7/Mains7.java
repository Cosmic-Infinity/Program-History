/*
7. **Abstract Methods and Concrete Classes:**
Define an interface `Animal` with an abstract method `makeSound()`.
Create a concrete class `Dog` that implements `Animal` and provides 
a specific implementation of `makeSound()`.
In another class, create an array of `Animal` and loop through it to call `makeSound()` on each element.
 */

class Mains7{
    public static void main(String[] args){
        Animal[] a = new Animal[3];
        for(int i=0; i<3; i++)
            a[i] = new Dog();
        for(int i=0; i<3; i++){
            System.out.print(i+1+". ");
            a[i].makeSound();
        }
    }
}
interface Animal{
    public abstract void makeSound();
}
class Dog implements Animal{
    public void makeSound(){
        System.out.println("Dog says WOOF!");
    }
}