/*
12. BufferedWriter for Writing to Console: Write a Java program that uses BufferedWriter to write multiple lines of text to the console.
 */

import java.io.*;

class Main12 {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
            writer.write("Line 1");
            writer.newLine();
            writer.write("Line 2");
            writer.newLine();
            writer.write("Line 3");
            writer.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
