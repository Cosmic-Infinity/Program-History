/*
6b. Write a program to create a class named Vehicle having protected instance variables
regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a
vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having
individual private instance variables routeNumber in Bus and manufacturerName in Car
and both of them having showData ( ) method showing all details of Bus and Car
respectively with content of the super class’s showData ( ) method.
 */

class Demo_Vehicle {
    public static void main(String[] args) {
        Bus bus = new Bus(5678, 60, "Blue", "Jack", 10);
        bus.showData();
        System.out.println();
        Car car = new Car(91011, 120, "Black", "Ramesh", "Toyota");
        car.showData();
    }
}
class Vehicle {
    protected String color, ownerName;
    protected int speed,regnNumber;

    public Vehicle(int regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData() {
        System.out.println("This is a vehicle class");
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    public Bus(int regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    public void showData() {
        super.showData();
        System.out.println("Route Number: " + routeNumber);
        System.out.println("Regn Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}

class Car extends Vehicle {
    private String manufacturerName;
    public Car(int regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    public void showData() {
        super.showData();
        System.out.println("Manufacturer Name: " + manufacturerName);
        System.out.println("Regn Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}

