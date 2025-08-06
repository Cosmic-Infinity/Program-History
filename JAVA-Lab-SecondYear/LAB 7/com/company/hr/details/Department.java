/*
**Subpackage Usage:**
Create a class `Employee` in a package `com.company.hr` and another class `Department` in a subpackage `com.company.hr.details`. Demonstrate how to import and use the `Employee` class from `Department`. Explain the role of sub-packages.

*/


package com.company.hr.details;

import com.company.hr.Employee;

public class Department {
    public static void main(String[] args) {
        Employee emp = new Employee("Aman");
        emp.displayInfo();
    }
}
