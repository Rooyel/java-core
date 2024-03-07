package com.learning.core.day5;

import java.util.HashSet;

class Product {
    private String productId;
    private String productName;

    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
}
public class D05P03 {

    public static void main(String[] args) {
        HashSet<Product> productSet = new HashSet<>();

        // Adding predefined product details
        productSet.add(new Product("P001", "Maruti 800"));
        productSet.add(new Product("P002", "Maruti Zen"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Maruti Alto"));

        // Listing all product details
        //System.out.println("Product Details:");
        for (Product product : productSet) {
            System.out.println(product);
        }
    }

}
