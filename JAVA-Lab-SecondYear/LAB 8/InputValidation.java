/*
16. Write a program that processes and validates a user’s input for multiple fields (name, age, email, etc.).
Implement exception handling for invalid formats and missing fields.
 */

import java.util.*;

class InputValidation {
    static String name, email;
    static int age;

    public static void main(String[] args) throws InvalidNameException, InvalidEmailException, InvalidAgeException {
        Scanner ob = new Scanner(System.in);

        try {
            System.out.println("Enter name:");
            name = ob.nextLine();
            if (name.length() < 3) {
                throw new InvalidNameException();
            }

            System.out.println("Enter age:");
            age = ob.nextInt();
            ob.nextLine();  // Consume newline
            if (age < 0 || age > 150) {
                throw new InvalidAgeException();
            }

            System.out.println("Enter email:");
            email = ob.nextLine();
            if (email.indexOf('@') == -1 || email.indexOf('.') == -1) {
                throw new InvalidEmailException();
            }

            System.out.println("Valid Input");

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter the correct data types.");
        } catch (InvalidNameException e) {
            System.out.println("Invalid name. Name should be at least 3 characters long.");
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age. Age should be between 0 and 150.");
        } catch (InvalidEmailException e) {
            System.out.println("Invalid email. Email should contain '@' and '.'.");
        }
    }
}

class InvalidNameException extends Exception {
    InvalidNameException() {}
}

class InvalidAgeException extends Exception {
    InvalidAgeException() {}
}

class InvalidEmailException extends Exception {
    InvalidEmailException() {}
}
