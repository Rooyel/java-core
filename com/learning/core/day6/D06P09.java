package com.learning.core.day6;

import java.util.*;

class Car4 implements Comparable<Car4> {
    private String name;
    private double price;

    public Car4(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
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
        Car4 car = (Car4) obj;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car4 other) {
        return this.name.compareTo(other.name);
    }
}

public class D06P09 {
    public static void main(String[] args) {
        TreeMap<Car4, Double> carMap = new TreeMap<>();

        // Predefined car details
        carMap.put(new Car4("Bugatti", 80050.0), 80050.0);
        carMap.put(new Car4("Swift", 305000.0), 305000.0);
        carMap.put(new Car4("Audi", 600100.0), 600100.0);
        carMap.put(new Car4("Benz", 900000.0), 900000.0);

        // Input value
        double newValue = 80050.0;

        // Update the value mapped by the specified key with the new value and name
        for (Map.Entry<Car4, Double> entry : carMap.entrySet()) {
            if (entry.getValue().equals(newValue)) {
                Car4 car = entry.getKey();
                car.setName("Reva");
                System.out.println(car.getName() + " " + car.getPrice());
                break;
            }
        }
    }
}
