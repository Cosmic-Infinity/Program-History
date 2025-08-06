/*
18. Write a program that reads integers from a file, performs mathematical operations (addition, multiplication),
and writes results to another file. Implement exception handling for file not found, I/O errors, and invalid data in the file.
 */

import java.io.*;

class FileProcess {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            int[] numbers = readIntegersFromFile(inputFile);
            int sum = calculateSum(numbers);
            int product = calculateProduct(numbers);
            writeResultsToFile(outputFile, sum, product);

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        } catch (InvalidDataException e) {
            System.out.println("Invalid data in the file: " + e.getMessage());
        }
    }

    static int[] readIntegersFromFile(String fileName) throws FileNotFoundException, IOException, InvalidDataException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        int[] numbers = new int[100]; // Assuming max 100 integers in file
        int count = 0;

        while ((line = br.readLine()) != null) {
            try {
                int number = Integer.parseInt(line.trim());
                numbers[count++] = number;
            } catch (NumberFormatException e) {
                throw new InvalidDataException("Non-integer value found: " + line);
            }
        }

        br.close();
        int[] validNumbers = new int[count];
        System.arraycopy(numbers, 0, validNumbers, 0, count);
        return validNumbers;
    }

    static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static int calculateProduct(int[] numbers) {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }

    static void writeResultsToFile(String fileName, int sum, int product) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        bw.write("Sum: " + sum);
        bw.newLine();
        bw.write("Product: " + product);
        bw.close();
        System.out.println("Check the files for relevent outputs");
    }
}

class InvalidDataException extends Exception {
    InvalidDataException(String message) {
        super(message);
    }
}
