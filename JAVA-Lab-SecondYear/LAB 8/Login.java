/*
6. Simulate a login system where the user must provide a valid username and password.
Implement exception handling for incorrect username/password, empty inputs, and unauthorized access attempts.
 */

import java.util.*;

class Login {
    static String validUsername = "user";
    static String validPassword = "pass123";
    static int unauthorizedAttempts = 0;

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Enter username:");
                String username = ob.nextLine();
                if (username.isEmpty()) {
                    throw new EmptyInputException("Username cannot be empty.");
                }
                System.out.println("Enter password:");
                String password = ob.nextLine();
                if (password.isEmpty()) {
                    throw new EmptyInputException("Password cannot be empty.");
                }

                if (!username.equals(validUsername) || !password.equals(validPassword)) {
                    unauthorizedAttempts++;
                    throw new InvalidCredentialsException("Incorrect username or password.");
                }

                System.out.println("Login successful!");
                break;

            } catch (EmptyInputException e) {
                System.out.println(e.getMessage());
            } catch (InvalidCredentialsException e) {
                System.out.println(e.getMessage());
                if (unauthorizedAttempts >= 3) {
                    System.out.println("Unauthorized access attempts detected. Please try again later.");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input format.");
            }
        }
    }
}

class EmptyInputException extends Exception {
    EmptyInputException(String message) {
        super(message);
    }
}

class InvalidCredentialsException extends Exception {
    InvalidCredentialsException(String message) {
        super(message);
    }
}
