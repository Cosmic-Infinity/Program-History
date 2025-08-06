/*
8. BufferedReader for Multi-line Input: Write a Java program that uses BufferedReader to take multiple lines of input from the user until the user enters the word "exit".
 */

import java.io.*;

class Main8 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            System.out.println("Enter text (type 'exit' to quit):");
            while (!(input = reader.readLine()).equalsIgnoreCase("exit")) {
                System.out.println("You entered: " + input);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
