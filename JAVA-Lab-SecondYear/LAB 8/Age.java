/*
10. Create a program that validates a user’s age.
If the user enters an invalid age (less than 0 or greater than 150),
throw a custom `InvalidAgeException` and handle it appropriately.
 */

import java.util.*;

class Age {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner ob = new Scanner(System.in);
        try {
            System.out.println("Enter your age:");
            int age = ob.nextInt();
            if (age < 0 || age > 150) {
                throw new InvalidAgeException();
            }
            System.out.println("Your age is valid: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Age must be between 0 and 150.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Enter an integer only");
        }
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException() {}
}
