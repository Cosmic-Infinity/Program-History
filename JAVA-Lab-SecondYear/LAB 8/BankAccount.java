/*
20. Write a program to implement a custom exception class (`NegativeAmountException`)
and use it in a scenario where a bank transaction cannot proceed because the withdrawal amount is negative.
 */

import java.util.*;
class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Negative withdrawal not allowed.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);
        System.out.println("Enter withdrawal amount: ");
        try {
            int amount = ob.nextInt();
            account.withdraw(amount);
        } catch (NegativeAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

class NegativeAmountException extends Exception {
    NegativeAmountException(String msg) {
        super(msg);
    }
}
