package com.learning.core.day6;

import java.util.*;

class Car1 implements Comparable<Car1> {
    private String name;
    private double price;

    public Car1(String name, double price) {
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
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car1 car = (Car1) obj;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car1 other) {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() {
        return name + " " + price;
    }
}

public class D06P07 {
    public static void main(String[] args) {
        TreeMap<Car1, Double> carMap = new TreeMap<>();

        // Predefined car details
        carMap.put(new Car1("Benz", 900000.0), 900000.0);
        carMap.put(new Car1("Bugatti", 80050.0), 80050.0);
        carMap.put(new Car1("Audi", 600100.0), 600100.0);
        carMap.put(new Car1("Swift", 305000.0), 305000.0);

        // Retrieve the key-value mapping associated with the greatest price
        Map.Entry<Car1, Double> greatestEntry = carMap.lastEntry();
        System.out.println(greatestEntry.getKey());

        // Retrieve the key-value mapping associated with the least price
        Map.Entry<Car1, Double> leastEntry = carMap.firstEntry();
        System.out.println(leastEntry.getKey());
    }
}
