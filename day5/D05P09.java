package com.learning.core.day5;

import java.util.*;

class Person9 implements Comparable<Person9> {
    private String name;
    private double salary;

    public Person9(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " " + salary;
    }

    @Override
    public int compareTo(Person9 o) {
        return Double.compare(this.salary, o.salary);
    }
}

public class D05P09 {
    public static void main(String[] args) {
        TreeSet<Person9> personSet = new TreeSet<>();

        personSet.add(new Person9("Jerry", 999.0));
        personSet.add(new Person9("Smith", 2999.0));
        personSet.add(new Person9("Popeye", 5999.0));
        personSet.add(new Person9("Jones", 6999.0));
        personSet.add(new Person9("John", 1999.0));
        personSet.add(new Person9("Tom", 3999.0));

        double sum = 0;
        for (Person9 person : personSet) {
            sum += person.getSalary();
        }

        System.out.println(sum);
    }
}
