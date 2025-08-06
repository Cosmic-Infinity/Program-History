/*
12. Write a vehicle management program using an abstract class `Vehicle` 
with abstract methods `start()`, `stop()`, and `fuelEfficiency()`.
Subclasses `ElectricCar` and `DieselTruck` implement these methods.
Demonstrate real-world scenarios like starting, stopping, and calculating
fuel efficiency for different types of vehicles.
 */
class Mains12 {
    public static void main(String[] args) {
        Vehicle electricCar = new ElectricCar(100.0f, 5.0f);
        Vehicle dieselTruck = new DieselTruck(300.0f, 3.0f);

        electricCar.start();
        System.out.println("Electric Fuel Efficiency: " + electricCar.fuelEfficiency() + " km/kWh");
        System.out.println("Electric Range: " + ((ElectricCar) electricCar).range() + " km");
        electricCar.stop();
        System.out.println("\n");
        dieselTruck.start();
        System.out.println("Diesel Fuel Efficiency: " + dieselTruck.fuelEfficiency() + " km/L");
        System.out.println("Diesel Range: " + ((DieselTruck) dieselTruck).range() + " km");
        dieselTruck.stop();
    }
}
abstract class Vehicle {
    abstract void start();

    abstract void stop();

    abstract float fuelEfficiency();
}

class ElectricCar extends Vehicle {
    float batt_cap;
    float efficiency;

    ElectricCar(float batt_cap, float efficiency) {
        this.batt_cap = batt_cap;
        this.efficiency = efficiency;
    }

    void start() {
        System.out.println("Electric vehicle started");
    }

    void stop() {
        System.out.println("Electric vehicle stopped");
    }

    float fuelEfficiency() {return efficiency;}

    float range() {return batt_cap * efficiency; }
}

class DieselTruck extends Vehicle {
    float fuel_cap; 
    float efficiency;  

    DieselTruck(float fuel_cap, float efficiency) {
        this.fuel_cap = fuel_cap;
        this.efficiency = efficiency;
    }

    void start() {
        System.out.println("Diesel vehicle started");
    }

    void stop() {
        System.out.println("Diesel vehicle stopped.");
    }

    float fuelEfficiency() {
        return efficiency;
    }

    float range() {
        return fuel_cap * efficiency;
    }
}


