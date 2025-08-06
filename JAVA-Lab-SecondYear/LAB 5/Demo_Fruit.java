/*
17. Aim of the program : Write
a program in Java having three classes Apple, Banana and Cherry. Class
Banana and Cherry are inherited from class Apple and each class have
their own member function show() . Using Dynamic Method Dispatch concept
display all the show() method of each class.
Input:  Mention show function of each class.
Output: Display show function of each class accordingly.
 */

public class Demo_Fruit {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Cherry cherry = new Cherry();
        Apple ref;
        ref = apple;
        ref.show();
        ref = banana;
        ref.show();
        ref = cherry;
        ref.show();
    }
}

class Apple {
    public void show() {
        System.out.println("This is the Apple class");
    }
}

class Banana extends Apple {
    public void show() {
        System.out.println("This is the Banana class");
    }
}

class Cherry extends Apple {
    public void show() {
        System.out.println("This is the Cherry class");
    }
}

