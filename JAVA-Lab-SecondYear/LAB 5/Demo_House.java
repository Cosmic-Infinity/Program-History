/*
8. Create a base class Building that stores the number of floors of a building, number of
rooms and it’s total footage. Create a derived class House that inherits Building and also
stores the number of bedrooms and bathrooms. Demonstrate the working of the classes.
 */

public class Demo_House {
    public static void main(String[] args) {
        Building building = new Building(3, 10, 5000.0);
        building.showData();
        System.out.println();
        House house = new House(2, 8, 3500.0, 4, 3);
        house.showData();
    }
}
class House extends Building {
    int bedrooms;
    int bathrooms;

    public House(int floors, int rooms, double totalFootage, int bedrooms, int bathrooms) {
        super(floors, rooms, totalFootage);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    public void showData() {
        super.showData();
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Bathrooms: " + bathrooms);
    }
}
class Building {
    int floors;
    int rooms;
    double totalFootage;

    public Building(int floors, int rooms, double totalFootage) {
        this.floors = floors;
        this.rooms = rooms;
        this.totalFootage = totalFootage;
    }

    public void showData() {
        System.out.println("Floors: " + floors);
        System.out.println("Rooms: " + rooms);
        System.out.println("Total Footage: " + totalFootage);
    }
}

