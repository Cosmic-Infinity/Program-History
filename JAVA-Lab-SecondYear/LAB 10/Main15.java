/*
15. FileReader and FileWriter: Write a Java program that reads from a text file using FileReader and writes the content to another text file using FileWriter.
 */

import java.io.*;

class Main15 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file5.txt");
            FileWriter fw = new FileWriter("file6.txt");

            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }

            fr.close();
            fw.close();

            System.out.println("File content copied successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
