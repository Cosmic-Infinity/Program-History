/*
25. BufferedReader vs Scanner: Write a Java program that reads a file using both BufferedReader and Scanner. Compare the time taken and ease of use.
 */

import java.io.*;
import java.util.Scanner;

class Main25 {
    public static void main(String[] args) {
        String fileName = "file13.txt";

        // Measure time for BufferedReader
        try {
            long startTime = System.currentTimeMillis();
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = reader.readLine()) != null) {
                // Do something with the line
            }

            reader.close();
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken using BufferedReader: " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Measure time for Scanner
        try {
            long startTime = System.currentTimeMillis();
            Scanner scanner = new Scanner(new File(fileName));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // Do something with the line
            }

            scanner.close();
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken using Scanner: " + (endTime - startTime) + " ms");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
