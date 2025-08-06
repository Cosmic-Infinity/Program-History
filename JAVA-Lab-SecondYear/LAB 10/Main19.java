/*
19. FileCopy Using Buffered Streams: Write a Java program that uses BufferedReader and BufferedWriter to read a text file and write its content to another file efficiently.
 */

import java.io.*;

class Main19 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file8.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("file9.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

            System.out.println("File copied successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
