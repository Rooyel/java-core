package com.learning.core.day6;

import java.util.*;

class Employee2 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee2(int id, String name, String department, String designation) {
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
        Employee2 emp = (Employee2) obj;
        return id == emp.id;
    }
}

public class D06P14 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee2> employeeTable = new Hashtable<>();

        employeeTable.put(1004, new Employee2(1004, "Grace", "HR", "Tech Support"));
        employeeTable.put(1003, new Employee2(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1002, new Employee2(1002, "Thomas", "Testing", "Tester"));
        employeeTable.put(1001, new Employee2(1001, "Daniel", "L&D", "Analyst"));

        Hashtable<Integer, Employee2> currentCollection = new Hashtable<>();
        currentCollection.put(1005, new Employee2(1005, "Charles", "Testing", "QA Lead"));
        currentCollection.put(1006, new Employee2(1006, "Henry", "Finance", "Accountant"));

        for (Map.Entry<Integer, Employee2> entry : currentCollection.entrySet()) {
            int id = entry.getKey();
            if (!employeeTable.containsKey(id)) {
                employeeTable.put(id, entry.getValue());
            }
        }

        for (Map.Entry<Integer, Employee2> entry : employeeTable.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
