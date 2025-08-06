/*
9. Create a complex shopping cart system using an abstract class `Product`
with methods `calculatePrice()` and `getDetails()`. Subclasses `Electronics`, `Clothing`, and `Groceries` 
implement the methods differently based on discounts and offers. Calculate the total price of items dynamically at runtime.
 */


class Mains9 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(new Electronics("Laptop", 1500, 2));
        cart.addItem(new Clothing("T-shirt", 500, 3));
        cart.addItem(new Groceries("Apples", 100, 10));

        System.out.println("Cart Details:");
        System.out.println(cart.getDetails());
        System.out.println("\nTotal Price: " + cart.calculateTotal());
    }
}
abstract class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    abstract double calculatePrice();

    String getDetails() {
        return name + ": " + price + " x " + quantity;
    }
}

class Electronics extends Product {
    double discount = 0.05; 

    Electronics(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    double calculatePrice() {
        return quantity * price * (1 - discount);
    }

    String getDetails() {
        return (super.getDetails() + " (Electronics, Discount: " + (discount * 100) + "%)");
    }
}

class Clothing extends Product {
    double discount = 0.06;

    public Clothing(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public double calculatePrice() {
        return quantity * price * (1 - discount);
    }

    public String getDetails() {
        return (super.getDetails() + " (Clothing, Discount: " + (discount * 100) + "%)");
    }
}

class Groceries extends Product {
    private double discount = 0.07;

    Groceries(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    double calculatePrice() {
        return quantity * price * (1 - discount);
    }

    String getDetails() {
        return (super.getDetails() + " (Groceries, Discount: " + (discount * 100) + "%)");
    }
}

class ShoppingCart {
    Product[] items;
    int itemCount;

    ShoppingCart() {
        items = new Product[5];
        itemCount = 0;
    }

    void addItem(Product item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
        } else {
            System.out.println("Shopping cart is full. Cannot add more items.");
        }
    }

    double calculateTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].calculatePrice();
        }
        return total;
    }

    String getDetails() {
        String details = "";
        for (int i = 0; i < itemCount; i++) {
            details += items[i].getDetails() + "\n";
        }
        return details;
    }
}


