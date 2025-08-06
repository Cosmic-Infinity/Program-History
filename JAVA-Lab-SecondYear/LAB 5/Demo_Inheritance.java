/*
16. Aim of the program : Illustrate
the execution of constructors in multi-level  inheritance with three
Java classes – plate(length, width), box(length, width, height), wood
box (length, width, height, thick) where box inherits from plate and
woodbox inherits from box class. Each class has constructor where
dimensions are taken from user.
Input: Enter the dimensions
Output: Display the dimensions accordingly
 */

import java.util.Scanner;
public class Demo_Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the dimensions for WoodBox:");
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();
        System.out.print("Thickness: ");
        double thickness = scanner.nextDouble();

        WoodBox woodBox = new WoodBox(length, width, height, thickness);
        woodBox.showDimensions();

        scanner.close();
    }
}

class Plate {
    double length;
    double width;

    public Plate(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void showDimensions() {
        System.out.println("Plate Dimensions:");
        System.out.println("Length: " + length + " units");
        System.out.println("Width: " + width + " units");
    }
}

class Box extends Plate {
    double height;

    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public void showDimensions() {
        super.showDimensions();
        System.out.println("Box Dimensions:");
        System.out.println("Height: " + height + " units");
    }
}

class WoodBox extends Box {
    double thickness;

    public WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
    }

    public void showDimensions() {
        super.showDimensions();
        System.out.println("WoodBox Dimensions:");
        System.out.println("Thickness: " + thickness + " units");
    }
}
