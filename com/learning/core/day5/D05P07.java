package com.learning.core.day5;
import java.util.*;

class Person7 implements Comparable<Person7> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person7(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person7 person = (Person7) obj;
        return id == person.id && age == person.age &&
                Double.compare(person.salary, salary) == 0 &&
                Objects.equals(name, person.name);
    }

    @Override
    public int compareTo(Person7 o) {
        return Integer.compare(this.id, o.id);
    }
}

public class D05P07 {
    public static void main(String[] args) {
        TreeSet<Person7> personSet = new TreeSet<>();

        personSet.add(new Person7(1, "Jerry", 22, 999.0));
        personSet.add(new Person7(2, "Smith", 25, 2999.0));
        personSet.add(new Person7(3, "Popeye", 28, 5999.0));
        personSet.add(new Person7(4, "Jones", 30, 6999.0));
        personSet.add(new Person7(5, "John", 32, 1999.0));
        personSet.add(new Person7(6, "Tom", 42, 3999.0));

        for (Person7 person : personSet) {
            System.out.println(person);
        }
    }
}
