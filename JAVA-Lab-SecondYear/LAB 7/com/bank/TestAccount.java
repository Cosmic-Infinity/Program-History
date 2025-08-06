package com.bank;

public class TestAccount {
    public static void main(String[] args) {
        Account acc = new Account("123456", 1000.0);
        acc.displayInfo();

        acc.deposit(500.0);
        acc.withdraw(200.0);
        acc.displayInfo();
    }
}
