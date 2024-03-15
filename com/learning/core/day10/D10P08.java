package com.learning.core.day10;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class D10P08 {

    Calculator calculator = new Calculator();

    @Test
    public void testMul() {
        int result = calculator.mul(3, 5);
        assertEquals(15, result);
    }

    @Test
    public void testDiv() {
        int result = calculator.div(10, 2);
        assertEquals(5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivByZero() {
        calculator.div(10, 0);
    }
}
