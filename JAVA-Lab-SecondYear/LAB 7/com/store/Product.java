package com.store;

public class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
}
