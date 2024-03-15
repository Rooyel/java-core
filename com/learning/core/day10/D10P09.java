package com.learning.core.day10;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class D10P09 {

    Calculator calculator = new Calculator();

    @Test
    public void testFindMax_PositiveInput() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int result = calculator.findMax(arr);
        assertEquals(6, result);
    }

    @Test
    public void testFindMax_NegativeInput() {
        int[] arr = {-1, -2, -3, -4, -5, -6};
        int result = calculator.findMax(arr);
        assertEquals(-1, result);
    }
}
