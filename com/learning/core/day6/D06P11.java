package com.learning.core.day6;

import java.util.*;

class Employee3 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee3(int id, String name, String department, String designation) {
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
        Employee3 emp = (Employee3) obj;
        return id == emp.id;
    }
}

public class D06P11 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee3> employeeTable = new Hashtable<>();

        // Adding provided employee details
        employeeTable.put(1005, new Employee3(1005, "Charles", "Testing", "QA Lead"));
        employeeTable.put(1004, new Employee3(1004, "Grace", "HR", "Tech Support"));
        employeeTable.put(1003, new Employee3(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1002, new Employee3(1002, "Thomas", "Testing", "Tester"));
        employeeTable.put(1001, new Employee3(1001, "Daniel", "L&D", "Analyst"));

        int searchId = 1003;

        if (employeeTable.containsKey(searchId)) {
            System.out.println(employeeTable.get(searchId));
        } else {
            System.out.println("Employee with ID " + searchId + " not found.");
        }
    }
}
