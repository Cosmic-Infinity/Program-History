package com.company.hr;

public class Employee {
    public String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
    }
}
