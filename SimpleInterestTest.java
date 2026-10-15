package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleInterestTest {

    @Test
    public void testSimpleInterest() {
        double result = SimpleInterest.calculate(10000, 5, 2);
        assertEquals(1000.0, result, 0.001);
    }
}