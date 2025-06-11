package com.giaolang.util.com.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    void getFactorial() {

    }

    @Test
    public void verifyFactorialGivenRightArg1RunsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    @Test
    public void verifyFactorialGivenRightArg2RunsWell() {
        assertEquals(2, MathUtility.getFactorial(2));
    }
}
