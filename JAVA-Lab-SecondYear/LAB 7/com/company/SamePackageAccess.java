package com.company;

public class SamePackageAccess {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 123, "HR", 50000.0);
        System.out.println("Name: " + emp.name);
        System.out.println("Id: " + emp.id);
        System.out.println("Dept: " + emp.dept);
        System.out.println("Salary: " + emp.getSalary());
    }
}
