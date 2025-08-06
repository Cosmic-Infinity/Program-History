/*
14. Create a base class called “vehicle” that stores number of wheels and speed.
Create the following derived classes –
“car” that inherits “vehicle” and also stores number of passengers.
“truck” that inherits “vehicle” and also stores the load limit.
Write a main function to create objects of these two derived classes and display all
the information about “car” and “truck”. Also compare the speed of these two
vehicles - car and truck and display which one is faster
*/

public class Demo_Vehicles {
    public static void main(String[] args) {
        Car car = new Car(4, 120.0, 5);
        System.out.println("Car Information:");
        car.showInfo();
        System.out.println();

        Truck truck = new Truck(6, 80.0, 15.0);
        System.out.println("Truck Information:");
        truck.showInfo();
        System.out.println();

        if (car.speed > truck.speed) {
            System.out.println("The car is faster than the truck.");
        } else if (car.speed < truck.speed) {
            System.out.println("The truck is faster than the car.");
        } else {
            System.out.println("The car and the truck have the same speed.");
        }
    }
}

class Vehicles {
    int numberOfWheels;
    double speed;

    public Vehicles(int numberOfWheels, double speed) {
        this.numberOfWheels = numberOfWheels;
        this.speed = speed;
    }

    public void showInfo() {
        System.out.println("Number of Wheels: " + numberOfWheels);
        System.out.println("Speed: " + speed + " mph");
    }
}

class Car extends Vehicles {
    int numberOfPassengers;

    public Car(int numberOfWheels, double speed, int numberOfPassengers) {
        super(numberOfWheels, speed);
        this.numberOfPassengers = numberOfPassengers;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Number of Passengers: " + numberOfPassengers);
    }
}

class Truck extends Vehicles {
    double loadLimit;

    public Truck(int numberOfWheels, double speed, double loadLimit) {
        super(numberOfWheels, speed);
        this.loadLimit = loadLimit;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Load Limit: " + loadLimit + " tons");
    }
}
