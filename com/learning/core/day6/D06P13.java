package com.learning.core.day6;

import java.util.*;

class Employee1 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee1(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + designation + " " + department;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee1 emp = (Employee1) obj;
        return id == emp.id;
    }
}

public class D06P13 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee1> employeeTable = new Hashtable<>();

        // Predefined employee details
        employeeTable.put(1004, new Employee1(1004, "Grace", "Tech Support", "HR"));
        employeeTable.put(1003, new Employee1(1003, "Robert", "Product Manager", "Development"));
        employeeTable.put(1002, new Employee1(1002, "Thomas", "Tester", "Testing"));
        employeeTable.put(1001, new Employee1(1001, "Daniel", "Analyst", "L&D"));

        // Adding a new employee
        employeeTable.put(1005, new Employee1(1005, "Alice", "Engineer", "R&D"));

        // Getting the number of keys in the Hashtable
        System.out.println(employeeTable.size());
    }
}
