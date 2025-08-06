/*
16. FileInputStream and FileOutputStream: Write a Java program that reads a file byte by byte using FileInputStream and writes the content to another file using FileOutputStream.
 */

import java.io.*;

class Main16 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file6.txt");
            FileOutputStream fos = new FileOutputStream("file7.txt");

            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            fis.close();
            fos.close();

            System.out.println("File content copied successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
