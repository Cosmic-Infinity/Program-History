/*
6. Write a program that models a vehicle rental system.
Create a superclass `Vehicle` and subclasses `Bike`, `Car`, and `Truck`. 
Use upcasting to store different vehicles in a single array. 
Demonstrate downcasting to calculate specific rental costs based on the type of vehicle.
 */

class Mains6{
    public static void main(String[] args){
        Vehicle[] a = new Vehicle[4];
        a[0] = new Bike(3);
        a[1] = new Car(10);
        a[2] = new Truck(20);
        a[3] = new Truck(30);

        for(int i=0; i<4; i++){
            float base = a[i].base;
            float price = 0;
            if(a[i] instanceof Bike){
                Bike b = (Bike)a[i];
                price = b.hourly * b.hour;
            }
            else if(a[i] instanceof Car){
                Car c = (Car)a[i];
                price = c.hourly * c.hour;
            }
            else if(a[i] instanceof Truck){
                Truck t = (Truck)a[i];
                price = t.hourly * t.hour;
            }
            System.out.println("Rental price: "+(base+price));
        }
    }
}
class Vehicle{
    float base = 100;
}
class Bike extends Vehicle{
    float hourly = 10, hour;
    Bike(int h){hour=h;}
}
class Car extends Vehicle{
    float hourly = 20, hour;
    Car(int h){hour=h;}
}  
class Truck extends Vehicle{
    float hourly = 30, hour;
    Truck(int h){hour=h;}
}
