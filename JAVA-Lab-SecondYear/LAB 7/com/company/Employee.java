package com.company;

public class Employee {
    public String name;
    protected int id;
    String dept;
    private double salary;

    public Employee(String name, int id, String dept, double salary) {
        this.name = name;
        this.id = id;
        this.dept = dept;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
