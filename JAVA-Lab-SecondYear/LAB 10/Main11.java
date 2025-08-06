/*
11. OutputStreamWriter for Console Output: Write a Java program that writes a message to the console using OutputStreamWriter.
 */

import java.io.*;

class Main11 {
    public static void main(String[] args) {
        try (OutputStreamWriter writer = new OutputStreamWriter(System.out)) {
            writer.write("this message is written using OutputStreamWriter");
            writer.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
