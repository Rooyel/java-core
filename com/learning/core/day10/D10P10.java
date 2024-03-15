package com.learning.core.day10;

import org.junit.Test;

public class D10P10 {

    @Test(timeout = 2000)
    public void testValidUsername() {
        UserProfile userProfile = new UserProfile();
        userProfile.validateUsername("JohnDoe");
        // Assertion is not necessary for this test
    }

    @Test(timeout = 2000)
    public void testInvalidUsername() {
        UserProfile userProfile = new UserProfile();
        userProfile.validateUsername("John123");
        // Assertion is not necessary for this test
    }

    @Test(timeout = 2000)
    public void testValidPassword() {
        UserProfile userProfile = new UserProfile();
        userProfile.validatePassword("Password1");
        // Assertion is not necessary for this test
    }

    @Test(timeout = 2000)
    public void testInvalidPassword() {
        UserProfile userProfile = new UserProfile();
        userProfile.validatePassword("Pass1");
        // Assertion is not necessary for this test
    }
}
