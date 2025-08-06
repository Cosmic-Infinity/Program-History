/*
13. DataOutputStream for Writing Primitive Data Types: Write a Java program that prompts the user for an integer, double, and string, then writes these values to the console using DataOutputStream.
 */

import java.io.*;

class Main13 {
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(System.out);
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter an integer:");
            int intValue = Integer.parseInt(reader.readLine());
            dos.writeInt(intValue);
            dos.flush();

            System.out.println("Enter a double:");
            double doubleValue = Double.parseDouble(reader.readLine());
            dos.writeDouble(doubleValue);
            dos.flush();

            System.out.println("Enter a string:");
            String stringValue = reader.readLine();
            dos.writeUTF(stringValue);
            dos.flush();

            System.out.println("\nValues written successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
