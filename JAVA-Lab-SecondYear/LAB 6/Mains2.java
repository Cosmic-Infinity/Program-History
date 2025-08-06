/*
2. Create a superclass `Vehicle` with methods `start()` and `fuelType()`.
Subclasses `ElectricVehicle` and `PetrolVehicle` override these methods.
Design a system where a list of different vehicle objects is stored in an array. 
Iterate through the array and dynamically call the overridden methods to display specific vehicle information. 
 */
class Mains2{
    public static void main(String[] args){
        Vehicle[] ar = new Vehicle[3];
        ar[0]= new Vehicle();
        ar[1]= new ElectricVehicle();  
        ar[2]= new PetrolVehicle();
        for(int i=0; i<3; i++){
            ar[i].start();
            ar[i].fuelType();
        }
    }
}
class Vehicle{
    void start(){
        System.out.println("Vehicle started successfully");
    }

    void fuelType(){
        System.out.println("Vehicle uses generic fuel");
    }
}
class ElectricVehicle extends Vehicle{
    void start(){
        System.out.println("Electric Vehicle started successfully");
    }

    void fuelType(){
        System.out.println("Electric Vehicle uses electricity");
    }
}
class PetrolVehicle extends Vehicle{
    void start(){
        System.out.println("Petrol Vehicle started successfully");
    }

    void fuelType(){
        System.out.println("Petrol Vehicle uses petrol");
    }
}