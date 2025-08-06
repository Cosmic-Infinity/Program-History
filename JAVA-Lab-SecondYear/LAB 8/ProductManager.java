/*
11. Design a `Product` class with methods to add, remove, and update product prices.
Implement exception handling for negative prices, invalid product IDs, and missing product information.
 */

import java.util.*;

class ProductManager {
    Product[] products;
    int productCount;

    ProductManager(int size) {
        products = new Product[size];
        productCount = 0;
    }

    public static void main(String[] args) {
        ProductManager manager = new ProductManager(10);
        Scanner ob = new Scanner(System.in);

        try {
            System.out.println("Add a product:");
            System.out.print("Enter product ID: ");
            int id = ob.nextInt();
            ob.nextLine();  // Consume newline
            System.out.print("Enter product name: ");
            String name = ob.nextLine();
            System.out.print("Enter product price: ");
            double price = ob.nextDouble();

            manager.addProduct(id, name, price);

            System.out.println("Update product price:");
            System.out.print("Enter product ID: ");
            id = ob.nextInt();
            System.out.print("Enter new product price: ");
            price = ob.nextDouble();

            manager.updateProductPrice(id, price);

            System.out.println("Remove a product:");
            System.out.print("Enter product ID: ");
            id = ob.nextInt();

            manager.removeProduct(id);

        } catch (InvalidProductIDException | NegativePriceException | MissingProductInfoException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter correct data types.");
        }
    }

    void addProduct(int id, String name, double price) throws NegativePriceException, MissingProductInfoException {
        if (name == null || name.isEmpty()) {
            throw new MissingProductInfoException("Product name cannot be empty.");
        }
        if (price < 0) {
            throw new NegativePriceException("Price cannot be negative.");
        }
        products[productCount++] = new Product(id, name, price);
        System.out.println("Product added: ID=" + id + ", Name=" + name + ", Price=" + price);
    }

    void updateProductPrice(int id, double price) throws InvalidProductIDException, NegativePriceException {
        int index = findProductIndex(id);
        if (index == -1) {
            throw new InvalidProductIDException("Product ID " + id + " does not exist.");
        }
        if (price < 0) {
            throw new NegativePriceException("Price cannot be negative.");
        }
        products[index].price = price;
        System.out.println("Product price updated: ID=" + id + ", New Price=" + price);
    }

    void removeProduct(int id) throws InvalidProductIDException {
        int index = findProductIndex(id);
        if (index == -1) {
            throw new InvalidProductIDException("Product ID " + id + " does not exist.");
        }
        products[index] = products[--productCount];
        products[productCount] = null;
        System.out.println("Product removed: ID=" + id);
    }

    int findProductIndex(int id) {
        for (int i = 0; i < productCount; i++) {
            if (products[i].id == id) {
                return i;
            }
        }
        return -1;
    }
}

class InvalidProductIDException extends Exception {
    InvalidProductIDException(String message) {
        super(message);
    }
}

class NegativePriceException extends Exception {
    NegativePriceException(String message) {
        super(message);
    }
}

class MissingProductInfoException extends Exception {
    MissingProductInfoException(String message) {
        super(message);
    }
}

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
