package com.learning.core.day6;
import java.util.*;

class Employee0 {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee0(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
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
        Employee0 emp = (Employee0) obj;
        return id == emp.id;
    }
}

public class D06P12 {
    public static void main(String[] args) {
        Hashtable<Integer, Employee0> employeeTable = new Hashtable<>();

        // Predefined employee details
        employeeTable.put(1004, new Employee0(1004, "Grace", "HR", "Tech Support"));
        employeeTable.put(1003, new Employee0(1003, "Robert", "Development", "Product Manager"));
        employeeTable.put(1002, new Employee0(1002, "Thomas", "Testing", "Tester"));
        employeeTable.put(1001, new Employee0(1001, "Daniel", "L&D", "Analyst"));

        // Operations to add employees if they do not exist
        addEmployeeIfNotExists(employeeTable, 1005, "Charles", "Testing", "QA Lead");

        // Printing employee details
        printEmployeeDetails(employeeTable, 1005);
        printEmployeeDetails(employeeTable, 1004);
        printEmployeeDetails(employeeTable, 1003);
        printEmployeeDetails(employeeTable, 1002);
        printEmployeeDetails(employeeTable, 1001);
    }

    // Method to add an employee if it doesn't exist
    private static void addEmployeeIfNotExists(Hashtable<Integer, Employee0> table, int id, String name, String department, String designation) {
        if (!table.containsKey(id)) {
            table.put(id, new Employee0(id, name, department, designation));
        }
    }

    // Method to print employee details
    private static void printEmployeeDetails(Hashtable<Integer, Employee0> table, int id) {
        if (table.containsKey(id)) {
        	 if (table.containsKey(id)) {
                 System.out.println(table.get(id));}
        }
    }
}
