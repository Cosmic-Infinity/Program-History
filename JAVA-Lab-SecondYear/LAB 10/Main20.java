/*
20. File Copy with Exception Handling: Write a Java program that copies the contents of one file to another, using FileInputStream and FileOutputStream, with proper exception handling.
 */

import java.io.*;

class Main20 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file9.txt");
            FileOutputStream fos = new FileOutputStream("file10.txt");

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
