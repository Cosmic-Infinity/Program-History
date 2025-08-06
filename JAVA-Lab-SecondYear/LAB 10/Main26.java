/*
26. Handling File Not Found Exception: Write a Java program that handles the FileNotFoundException when trying to read from a non-existent file.
 */

import java.io.*;

class Main26 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("non_existent_file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("The specified file was not found.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
