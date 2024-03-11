package com.learning.core.day6;

import java.util.*;

class Car0 implements Comparable<Car0> {
    private String name;
    private double price;

    public Car0(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car0 car = (Car0) obj;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car0 other) {
        return Double.compare(other.price, this.price); // Compare in descending order by price
    }
}

public class D06P06 {
    public static void main(String[] args) {
        TreeMap<Car0, Double> carMap = new TreeMap<>();

        // Predefined car details
        carMap.put(new Car0("Bugatti", 80050.0), 80050.0);
        carMap.put(new Car0("Swift", 305000.0), 305000.0);
        carMap.put(new Car0("Audi", 600100.0), 600100.0);
        carMap.put(new Car0("Benz", 900000.0), 900000.0);

        // Retrieving and printing car prices with names in descending order by price
        for (Map.Entry<Car0, Double> entry : carMap.entrySet()) {
            System.out.println(entry.getKey()); // This will print the car name and price
        }
    }
}

