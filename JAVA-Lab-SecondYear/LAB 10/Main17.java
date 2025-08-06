/*
17. Using PrintStream to Write to a File: Write a Java program that writes "Hello, World!" to a text file using PrintStream.
 */

import java.io.*;

class Main17 {
    public static void main(String[] args) {
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("file8.txt"));
            ps.println("Hello, World!");
            ps.close();
            System.out.println("Message written to file successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
