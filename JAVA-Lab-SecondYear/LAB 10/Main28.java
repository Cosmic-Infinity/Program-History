/*
28. Custom Exception for File I/O Errors: Write a Java program that creates a custom exception for file-related errors and uses it when a file cannot be accessed.
 */

import java.io.*;

class Main28 {
    public static void main(String[] args) throws FileAccessException {
        try{
            try {
                BufferedReader reader = new BufferedReader(new FileReader("non_existent_file.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } catch (FileNotFoundException e) {
                throw new FileAccessException("File wasn't found");
            } catch (IOException e) {
                throw new FileAccessException("IO Exception occured");
            }
        }catch(FileAccessException e){
            System.out.println(e.getMessage());
        }
    }
}

class FileAccessException extends Exception {
    public FileAccessException(String message) {
        super(message);
    }
}

