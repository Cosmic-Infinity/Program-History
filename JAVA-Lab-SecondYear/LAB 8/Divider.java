/*
9. Write a program that accepts a list of integers and performs division by a given divisor.
Handle exceptions for division by zero and invalid divisor inputs.
*/

import java.util.*;

class Divider {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        try {
            System.out.println("Enter the number of integers:");
            int n = ob.nextInt();
            int[] numbers = new int[n];
            System.out.println("Enter the integers:");
            for (int i = 0; i < n; i++) {
                numbers[i] = ob.nextInt();
            }

            System.out.println("Enter the divisor:");
            int divisor = ob.nextInt();

            for (int number : numbers) {
                try {
                    int result = number / divisor;
                    System.out.println(number + " / " + divisor + " = " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter only integers.");
        }
    }
}
