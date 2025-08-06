/*
23. Using RandomAccessFile to Write Data: Write a Java program that writes a series of numbers into a file using RandomAccessFile and reads them back.
 */

import java.io.*;

class Main23 {
    public static void main(String[] args) {
        try {
            RandomAccessFile raf = new RandomAccessFile("file12.txt", "rw");

            // Write a series of numbers to the file
            for (int i = 0; i < 10; i++) {
                raf.writeInt(i);
            }

            // Read the numbers back from the file
            raf.seek(0);
            System.out.println("Numbers read from the file:");
            for (int i = 0; i < 10; i++) {
                System.out.println(raf.readInt());
            }

            raf.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
