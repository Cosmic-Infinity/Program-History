/*
21. Random Access and Advanced File I/O: RandomAccessFile for File Modification:
·  Write a Java program using RandomAccessFile to read and modify specific positions in a file.
 */

import java.io.*;

class Main21 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("file10.txt", "rw");

            // Read and print the initial content
            System.out.println("Initial content:");
            String line;
            while ((line = raf.readLine()) != null) {
                System.out.println(line);
            }

            // Modify a specific position (e.g., write "Hello" at position 10)
            raf.seek(10);
            raf.writeBytes("Hello");

            // Reset file pointer to the beginning and print the modified content
            raf.seek(0);
            System.out.println("Modified content:");
            while ((line = raf.readLine()) != null) {
                System.out.println(line);
            }

            raf.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
