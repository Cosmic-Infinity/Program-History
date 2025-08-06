/*
14. Writing Formatted Data to Console: Write a Java program that uses PrintWriter to print formatted data (such as a name and age) to the console.
 */

import java.io.*;

class Main14 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your name:");
            String name = reader.readLine();

            System.out.println("Enter your age:");
            int age = Integer.parseInt(reader.readLine());

            PrintWriter writer = new PrintWriter(System.out, true);
            writer.printf("Name: %s, Age: %d%n", name, age);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
