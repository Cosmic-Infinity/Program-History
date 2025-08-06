/*
29. Counting Words in a File: Write a Java program that reads a text file and counts the number of words in it using BufferedReader.
 */

import java.io.*;

class Main29 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file13.txt"));
            String line;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            reader.close();
            System.out.println("Total number of words: " + wordCount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
