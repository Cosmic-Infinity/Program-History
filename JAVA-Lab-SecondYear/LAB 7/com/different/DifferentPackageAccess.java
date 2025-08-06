package com.different;

import com.company.Employee;

public class DifferentPackageAccess {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 456, "Finance", 60000.0);
        System.out.println("Name: " + emp.name);
        System.out.println("Salary: " + emp.getSalary());
    }
}
