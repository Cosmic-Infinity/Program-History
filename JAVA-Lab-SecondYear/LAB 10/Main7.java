/*
7. InputStreamReader for Console Input: Write a Java program that reads a line of text from the user using InputStreamReader and prints it to the console.
 */

import java.io.*;

class Main7 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a line of text:");
            String input = reader.readLine();
            System.out.println("You entered: " + input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
