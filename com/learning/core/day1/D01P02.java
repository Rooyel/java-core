package com.learning.core.day1;
interface MedicineInfo {
    void displayLabel();
}

// Implement the interface with Tablet class
class Tablet implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Store tablets in a cool, dry place.");
    }
}

// Implement the interface with Syrup class
class Syrup implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Shake Syrup well before use.");
    }
}

// Implement the interface with Ointment class
class Ointment implements MedicineInfo {
    @Override
    public void displayLabel() {
        System.out.println("Ointment for external use only.");
    }
}

// TestClass to demonstrate the implementation
public class D01P02 {
    public static void main(String[] args) {
        // Create an array of MedicineInfo
        MedicineInfo[] medicines = new MedicineInfo[3];
        
        // Populate the array with instances of Tablet, Syrup, and Ointment
        medicines[0] = new Tablet();
        medicines[1] = new Syrup();
        medicines[2] = new Ointment();
        
        // Demonstrate polymorphic behavior by calling displayLabel() on each object
        for (MedicineInfo medicine : medicines) {
            medicine.displayLabel();
        }
    }
}