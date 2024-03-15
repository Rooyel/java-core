package com.learning.core.day10;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class D10P07 {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int result = calculator.add(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testSub() {
        int result = calculator.sub(8, 3);
        assertEquals(5, result);
    }
}
