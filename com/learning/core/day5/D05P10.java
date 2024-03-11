package com.learning.core.day5;

import java.util.*;

class Person10 implements Comparable<Person10> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person10(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person10 person = (Person10) obj;
        return id == person.id && age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name);
    }

    @Override
    public int compareTo(Person10 o) {
        return Integer.compare(this.id, o.id);
    }
}

public class D05P10 {
    public static void main(String[] args) {
        TreeSet<Person10> personSet = new TreeSet<>();

        personSet.add(new Person10(1, "Jerry", 22, 999.0));
        personSet.add(new Person10(2, "Smith", 25, 2999.0));
        personSet.add(new Person10(3, "Popeye", 28, 5999.0));
        personSet.add(new Person10(4, "Jones", 22, 6999.0));
        personSet.add(new Person10(5, "John", 32, 1999.0));
        personSet.add(new Person10(6, "Tom", 42, 3999.0));

        for (Person10 person : personSet) {
            if (person.getName().startsWith("J")) {
                System.out.println(person);
                break; // Break out of loop after printing the first person whose name starts with "J"
            }
        }
    }
}

