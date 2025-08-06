/*
15. Create a multi-functional application that combines early binding,
late binding, abstract classes, upcasting, and downcasting.
Use an abstract class `User` with methods `login()` and `logout()`.
Subclass `Admin` adds features like `manageUsers()`, and `Customer` adds features like `viewProducts()`.

Demonstrate:

Early binding by overloading `viewProducts()` to filter by category or price.
Late binding by overriding `login()` for role-based authentication.
Upcasting and downcasting to dynamically manage `Admin` and `Customer` objects.
 */


class Mains15 {
    public static void main(String[] args) {
        User adminUser = new Admin();
        User customerUser = new Customer();

        adminUser.login();
        customerUser.login();

        if (adminUser instanceof Admin) {
            Admin admin = (Admin) adminUser;
            admin.manageUsers();
        }

        if (customerUser instanceof Customer) {
            Customer customer = (Customer) customerUser;
            customer.viewProducts();
            customer.viewProducts("Electronics");
            customer.viewProducts(500.0);
        }

        adminUser.logout();
        customerUser.logout();
    }
}

abstract class User {
    abstract void login();
    abstract void logout();
}

class Admin extends User {
    void login() {
        System.out.println("Admin logged in");
    }

    void logout() {
        System.out.println("Admin logged out.");
    }

    void manageUsers() {
        System.out.println("Admin is managing");
    }
}

class Customer extends User {
    void login() {
        System.out.println("Customer logged in");
    }

    void logout() {
        System.out.println("Customer logged out");
    }

    void viewProducts() {
        System.out.println("Customer is viewing products.");
    }

    void viewProducts(String category) {
        System.out.println("Customer is viewing products in : " + category);
    }

    void viewProducts(double maxPrice) {
        System.out.println("Customer is viewing products with a price : " + maxPrice);
    }
}
