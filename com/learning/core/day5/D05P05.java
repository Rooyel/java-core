package com.learning.core.day5;
import java.util.HashSet;
import java.util.Iterator;

class Product5 {
    private String productId;
    private String productName;

    public Product5(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String toString() {
        return productId + " " + productName;
    }
}
public class D05P05 {

    public static void main(String[] args) {
        HashSet<Product5> productSet = new HashSet<>();

        // Adding predefined product details
        productSet.add(new Product5("P001", "Maruti 800"));
        productSet.add(new Product5("P002", "Maruti Zen"));
        productSet.add(new Product5("P003", "Maruti Dezire"));
        productSet.add(new Product5("P004", "Maruti Alto"));

        // Remove a particular product by product ID
        String removeProductId = "P002";
        Iterator<Product5> iterator = productSet.iterator();
        while (iterator.hasNext()) {
            Product5 product = iterator.next();
            if (product.getProductId().equals(removeProductId)) {
                iterator.remove();
                break;
            }
        }

        for (Product5 product : productSet) {
            System.out.println(product);
        }
    }

}
