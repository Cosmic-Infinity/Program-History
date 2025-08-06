/*
9. DataInputStream for Reading Primitive Data Types: Write a Java program that reads multiple primitive data types (e.g., int, float, double) from the user using DataInputStream and prints them.
 */

import java.io.*;

class Main9 {
    public static void main(String[] args) {
        try {
            DataInputStream dataInput = new DataInputStream(System.in);
            System.out.println("Enter an integer:");
            int intValue = Integer.parseInt(dataInput.readLine());
            System.out.println("You entered: " + intValue);

            System.out.println("Enter a float:");
            float floatValue = Float.parseFloat(dataInput.readLine());
            System.out.println("You entered: " + floatValue);

            System.out.println("Enter a double:");
            double doubleValue = Double.parseDouble(dataInput.readLine());
            System.out.println("You entered: " + doubleValue);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
