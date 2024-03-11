package com.learning.core.day6;

import java.util.*;

class Employee4 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee4(int id, String name, String department, String designation) {
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
        return id + " " + name + "\n" + designation + "\n" + department;
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
        Employee4 emp = (Employee4) obj;
        return id == emp.id;
    }
}

public class D06P10 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee4> employeeTable = new Hashtable<>();

        employeeTable.put(1004, new Employee4(1004, "Grace", "HR", "Tech Support"));
        employeeTable.put(1003, new Employee4(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1002, new Employee4(1002, "Thomas", "Testing", "Tester"));
        employeeTable.put(1001, new Employee4(1001, "Daniel", "L&D", "Analyst"));

        boolean isEmpty = employeeTable.isEmpty();
        System.out.println(isEmpty);
    }
}
