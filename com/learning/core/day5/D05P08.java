package com.learning.core.day5;

import java.util.*;

class Person8 implements Comparable<Person8> {
    private int id;
    private String name;
    private double salary;

    public Person8(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    @Override
    public int compareTo(Person8 o) {
        return Integer.compare(this.id, o.id);
    }
}

public class D05P08 {
    public static void main(String[] args) {
        TreeSet<Person8> personSet = new TreeSet<>();

        personSet.add(new Person8(1, "Jerry", 999.0));
        personSet.add(new Person8(2, "Smith", 2999.0));
        personSet.add(new Person8(3, "Popeye", 5999.0));
        personSet.add(new Person8(4, "Jones", 6999.0));
        personSet.add(new Person8(5, "John", 1999.0));
        personSet.add(new Person8(6, "Tom", 3999.0));

        System.out.println("Names of persons in uppercase:");
        for (Person8 person : personSet) {
            System.out.println(person.getName().toUpperCase());
        }
    }
}
