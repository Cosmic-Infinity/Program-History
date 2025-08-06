/*
22. RandomAccessFile to Read and Write Data: Write a Java program using RandomAccessFile to read an integer from a file at a specific position, modify it, and save it back to the file.
 */

import java.io.*;

class Main22 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("file11.txt", "rw");

            // Read integer at specific position (e.g., position 2)
            raf.seek(2);
            int value = raf.readInt();
            System.out.println("Original value: " + value);

            // Modify the integer (e.g., increment by 10)
            value += 1234;
            raf.seek(4);
            raf.writeInt(value);

            // Verify the modification
            raf.seek(4);
            int modifiedValue = raf.readInt();
            System.out.println("Modified value: " + modifiedValue);

            raf.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
