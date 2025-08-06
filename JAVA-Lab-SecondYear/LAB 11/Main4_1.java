/*
4.1. Write a Java program that simulates a bank account
with methods to deposit and withdraw money, ensuring thread safety
using synchronization. */

public class Main4_1 {
    private int bal = 0;
    // Synchronized deposit method
    public synchronized void deposit(int amnt) {
        bal += amnt;
        System.out.println("Deposited " + amnt + ", Balance: " + bal);
    }

    // Synchronized withdraw method
    public synchronized void withdraw(int amnt) {
        if (bal >= amnt) {
            bal -= amnt;
            System.out.println("Withdrew " + amnt + ", Balance: " + bal);
        } else {
            System.out.println("Insufficient funds! Balance: " + bal);
        }
    }

    public static void main(String[] args) {
        Main4_1 account = new Main4_1();
        //deposit
        Runnable depositTask = () -> {
            for (int i = 1; i <= 3; i++) {
                account.deposit(100);
            }
        };
        //withdraw
        Runnable withdrawTask = () -> {
            for (int i = 1; i <= 3; i++) {
                account.withdraw(50);
            }
        };

        Thread t1 = new Thread(depositTask, "t1");
        Thread t2 = new Thread(withdrawTask, "t2");
        Thread t3 = new Thread(depositTask, "t3");

        t1.start();
        t2.start();
        t3.start();
    }
}
