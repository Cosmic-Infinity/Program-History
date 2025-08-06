/*
12. Write a program that simulates an ATM withdrawal system.
Implement exception handling for invalid PIN, insufficient balance, and invalid withdrawal amounts.
*/

import java.util.*;

class ATM {
    static int balance = 10000;
    static final int PIN = 1234;

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        try {
            System.out.println("Enter your PIN:");
            int enteredPin = ob.nextInt();

            if (enteredPin != PIN) {
                throw new InvalidPINException("Invalid PIN.");
            }

            System.out.println("Enter withdrawal amount:");
            int withdrawalAmount = ob.nextInt();

            if (withdrawalAmount <= 0) {
                throw new InvalidWithdrawalAmountException("Withdrawal must be greater than zero.");
            }

            if (withdrawalAmount > balance) {
                throw new InsufficientBalanceException("Insufficient balance.");
            }

            balance -= withdrawalAmount;
            System.out.println("Successful. Remaining balance: " + balance);

        } catch (InvalidPINException | InvalidWithdrawalAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Enter numbers");
        }
    }
}

class InvalidPINException extends Exception {
    InvalidPINException(String message) {
        super(message);
    }
}

class InvalidWithdrawalAmountException extends Exception {
    InvalidWithdrawalAmountException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}
