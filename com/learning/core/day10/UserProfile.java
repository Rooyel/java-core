package com.learning.core.day10;

public class UserProfile {
    public void validateUsername(String name) {
        if (name.matches("[a-zA-Z]+")) {
            System.out.println("Username is valid.");
        } else {
            System.out.println("Username is invalid. It should contain only characters.");
        }
    }

    public void validatePassword(String password) {
        if (password.matches("^(?=.*[0-9])(?=.*[a-zA-Z]).{8}$")) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid. It should be 8 characters long with a combination of alphabets and digits.");
        }
    }
}
