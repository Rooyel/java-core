package com.learning.core.day5;

import java.util.Random;

class Register<T> {
    private String registerId;

    public String generateRegisterId(int n) {
        StringBuilder sb = new StringBuilder();
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rnd = new Random();
        while (sb.length() < n) {
            int index = (int) (rnd.nextFloat() * characters.length());
            sb.append(characters.charAt(index));
        }
        registerId = sb.toString();
        return registerId;
    }

    public void display(T user) {
        if (user instanceof Employee) {
            Employee emp = (Employee) user;
            System.out.println(registerId + " " + emp.getName() + " " + emp.getPhoneNo() + " " +
                    emp.getEmployeeld() + " " + emp.getPassportNo());
        } else if (user instanceof Student) {
            Student student = (Student) user;
            System.out.println(registerId + " " + student.getName() + " " + student.getPhoneNo() + " " +
                    student.getLicenseNo() + " " + student.getPanCardNo());
        }
    }
}

class Employee {
    private String name;
    private long phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;
    private int voterId;
    private int employeeId;

    public Employee(String name, long phoneNo, int employeeId, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.passportNo = passportNo;
    }

    public Employee(String name, long phoneNo, int employeeId, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Employee(String name, long phoneNo, int employeeId, int licenseNo, int voterId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.voterId = voterId;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public int getEmployeeld() {
        return employeeId;
    }
}


class Student {
    private String name;
    private long phoneNo;
    private String passportNo;
    private int licenseNo;
    private String panCardNo;
    private int voterId;

    public Student(String name, long phoneNo, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.passportNo = passportNo;
    }

    public Student(String name, long phoneNo, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Student(String name, long phoneNo, int licenseNo, int voterId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.voterId = voterId;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public int getLicenseNo() {
        return licenseNo;
    }

    public String getPanCardNo() {
        return panCardNo;
    }
}

public class D05P01 {

    public static void main(String[] args) {
        Register<Employee> empRegister = new Register<>();
        Register<Student> stuRegister = new Register<>();

        // Input for an Employee
        Employee employee = new Employee("Arun", 9123456780L, 1101, "LA78833DG");
        String empRegisterId = empRegister.generateRegisterId(6);
        empRegister.display(employee);

        // Input for a Student
        Student student = new Student("Joseph", 9123412780L, 2210, "SJLD1717K");
        String stuRegisterId = stuRegister.generateRegisterId(6);
        stuRegister.display(student);

    }

}
