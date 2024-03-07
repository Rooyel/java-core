package com.learning.core.day5;
import java.util.HashSet;

class Product1 {
    private String productId;
    private String productName;

    public Product1(String productId, String productName) {
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

public class D05P04 {

    public static void main(String[] args) {
        HashSet<Product1> productSet = new HashSet<>();

        // Adding predefined product details
        productSet.add(new Product1("P001", "Maruti 800"));
        productSet.add(new Product1("P002", "Maruti Zen"));
        productSet.add(new Product1("P003", "Maruti Dezire"));
        productSet.add(new Product1("P004", "Maruti Alto"));

        // Search for a particular product
        String searchProductId = "P003";
        String productName = "Maruti Dezire";

        boolean found = false;
        for (Product1 product : productSet) {
            if (product.getProductId().equals(searchProductId) && product.getProductName().equals(productName)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Product Found");
        } else {
            System.out.println("Product Not Found");
        }
    }

}
