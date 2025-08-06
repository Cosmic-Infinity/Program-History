/*
17. Create a program that simulates an online order system.
Handle exceptions for out-of-stock products, invalid payment methods, and exceeding the maximum order quantity.
 */

import java.util.*;

class Order {
    static int[] productStock = {10, 5, 2}; // Stock for 3 products
    static final int MAX_ORDER_QUANTITY = 5;
    static String[] validPaymentMethods = {"P1", "P2", "P3"};

    public static void main(String[] args) throws OutOfStockException, InvalidPaymentMethodException, MaxOrderQuantityException {
        Scanner ob = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter product ID (0, 1, 2):");
                int productId = ob.nextInt();
                if (productId < 0 || productId >= productStock.length) {
                    System.out.println("Invalid product ID.");
                    continue; // Skip to the next iteration
                }

                System.out.println("Enter quantity:");
                int quantity = ob.nextInt();
                ob.nextLine(); // Consume newline
                System.out.println("Enter payment method (P1, P2, P3):");
                String paymentMethod = ob.nextLine();

                processOrder(productId, quantity, paymentMethod);

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Data Type.");
                ob.nextLine(); // Clear buffer
            } catch (OutOfStockException e) {
                System.out.println("Product Out of stock.");
            } catch (InvalidPaymentMethodException e) {
                System.out.println("Invalid payment method.");
            } catch (MaxOrderQuantityException e) {
                System.out.println("Exceeds the maximum order limit.");
            }
        }
    }

    static void processOrder(int productId, int quantity, String paymentMethod) throws OutOfStockException, InvalidPaymentMethodException, MaxOrderQuantityException {
        if (productStock[productId] < quantity) {
            throw new OutOfStockException();
        }
        if (!isValidPaymentMethod(paymentMethod)) {
            throw new InvalidPaymentMethodException();
        }
        if (quantity > MAX_ORDER_QUANTITY) {
            throw new MaxOrderQuantityException();
        }

        productStock[productId] -= quantity;
        System.out.println("Order successful: Product ID=" + productId + ", Quantity=" + quantity + ", Payment Method=" + paymentMethod);
    }

    static boolean isValidPaymentMethod(String paymentMethod) {
        for (String method : validPaymentMethods) {
            if (method.equalsIgnoreCase(paymentMethod)) {
                return true;
            }
        }
        return false;
    }
}

class OutOfStockException extends Exception {
    OutOfStockException() {}
}

class InvalidPaymentMethodException extends Exception {
    InvalidPaymentMethodException() {}
}

class MaxOrderQuantityException extends Exception {
    MaxOrderQuantityException() {}
}
