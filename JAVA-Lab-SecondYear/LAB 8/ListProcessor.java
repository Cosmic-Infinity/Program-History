/*
13. Write a method that accepts a list of integers and returns the largest number.
If the list is empty, throw a custom exception (`EmptyListException`) and handle it appropriately.
 */

import java.util.*;

class ListProcessor {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        try {
            System.out.println("Enter the number of integers:");
            int n = ob.nextInt();

            System.out.println("Enter integers:");
            for (int i = 0; i < n; i++) {
                numbers.add(ob.nextInt());
            }

            int largest = findLargest(numbers);
            System.out.println("The largest number: " + largest);
        } catch (EmptyListException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Only integers allowed");
        }
    }

    static int findLargest(List<Integer> numbers) throws EmptyListException {
        if (numbers.isEmpty()) {
            throw new EmptyListException("Empty List");
        }

        int largest = numbers.get(0);
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }
}

class EmptyListException extends Exception {
    EmptyListException(String message) {
        super(message);
    }
}
