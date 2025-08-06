/*
10. Console Input Validation: Write a Java program using BufferedReader to read an integer from the user and validate if the input is a valid number.
 */

import java.io.*;

class Main10 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter an integer:");
            String input = reader.readLine();
            try {
                int number = Integer.parseInt(input);
                System.out.println("You entered a valid number: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
