/*
 11. Create a payment processing system using an abstract class `Payment`
 with methods `processPayment()` and `getReceipt()`.
 Subclasses `CreditCardPayment`, `UPIPayment`, and `NetBankingPayment` implement the methods. 
 Simulate real-world transactions and generate receipts dynamically.
*/

class Mains11 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("TXN12345", 25000, "123456789");
        p1.processPayment();
        System.out.println(p1.getReceipt());
        System.out.println("\n");
        Payment p2 = new UPIPayment("TXN67890", 100, "abc@upi");
        p2.processPayment();
        System.out.println(p2.getReceipt());
        System.out.println("\n");
        Payment p3 = new NetBankingPayment("TXN11223", 500, "Bank of India");
        p3.processPayment();
        System.out.println(p3.getReceipt());
    }
}
abstract class Payment {
    String t_id;
    double amount;

    Payment(String t_id, double amount) {
        this.t_id = t_id;
        this.amount = amount;
    }

    abstract void processPayment();
    abstract String getReceipt();
}

class CreditCardPayment extends Payment {
    String card_no;

    CreditCardPayment(String t_id, double amount, String card_no) {
        super(t_id, amount);
        this.card_no = card_no;
    }

    void processPayment() {
        System.out.println("Processing credit card payment...");
    }

    String getReceipt() {
        String s = "Receipt:\nTransaction ID: " + t_id + "\nAmount: " + amount + "\nPayment Method: Card Number: " + card_no;
        return s;
    }
}

class UPIPayment extends Payment {
    String upiId;

    UPIPayment(String t_id, double amount, String upiId) {
        super(t_id, amount);
        this.upiId = upiId;
    }

    void processPayment() {
        System.out.println("Processing UPI payment...");
    }

    String getReceipt() {
        String s ="Receipt:\nTransaction ID: " + t_id + "\nAmount: " + amount + "\nPayment Method: UPI ID: " + upiId;;
        return s;
    }
}

class NetBankingPayment extends Payment {
    String bankName;

    NetBankingPayment(String t_id, double amount, String bankName) {
        super(t_id, amount);
        this.bankName = bankName;
    }

    void processPayment() {
        System.out.println("Processing net banking payment...");
    }

    String getReceipt() {
        return "Receipt:\nTransaction ID: " + t_id + "\nAmount: " + amount + "\nPayment Method: Net Banking\nBank Name: " + bankName;
    }
}



