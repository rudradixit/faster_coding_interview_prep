package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFibonacci {
    @Test
    void testCase1() {
        assertEquals(89, Fibonacci.get_fibonacci(11));
    }

    @Test
    void testCase2() {
        assertEquals(4181, Fibonacci.get_fibonacci(19));
    }

    @Test
    void testCase3() {
        assertEquals(6765, Fibonacci.get_fibonacci(20));
    }
}