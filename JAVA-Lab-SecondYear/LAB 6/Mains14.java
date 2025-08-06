/*
14. Implement a device management system where a superclass `Device`
 has methods `powerOn()` and `powerOff()`.
 Subclasses `Smartphone` and `Laptop` override the methods with unique implementations. 
 Add overloaded methods `update()` in `Device` for early binding, and demonstrate late binding through polymorphism.
*/

class Mains14 {
    public static void main(String[] args) {
        Device mySmartphone = new Smartphone();
        Device myLaptop = new Laptop();

        mySmartphone.update();
        mySmartphone.update("v1.2.3");

        mySmartphone.powerOn();
        mySmartphone.powerOff();

        myLaptop.powerOn();
        myLaptop.powerOff();
    }
}
class Device {
    void powerOn() {
        System.out.println("Powering on.");
    }

    void powerOff() {
        System.out.println("Powering off.");
    }

    void update() {
        System.out.println("Updating...");
    }

    void update(String version) {
        System.out.println("Updating to version: " + version);
    }
}

class Smartphone extends Device {
    void powerOn() {
        System.out.println("Smartphone is powering on");
    }

    void powerOff() {
        System.out.println("Smartphone is powering off");
    }
}

class Laptop extends Device {
    void powerOn() {
        System.out.println("Laptop is powering up");
    }

    void powerOff() {
        System.out.println("Laptop is powering off");
    }
}


