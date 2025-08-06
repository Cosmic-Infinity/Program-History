/*
18. Writing to a File with PrintWriter: Write a Java program that uses PrintWriter to append a line of text to an existing file.
 */

import java.io.*;

class Main18 {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("file8.txt", true));
            pw.println("This line of text is appended.");
            pw.close();
            System.out.println("Text appended to file successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
