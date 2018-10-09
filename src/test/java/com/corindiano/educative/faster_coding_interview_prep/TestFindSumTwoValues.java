package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFindSumTwoValues {
    @Test
    void testCase1() {
        assertTrue(FindSumTwoValues.find_sum_of_two(new int[]{5, 7, 1, 2, 8, 4, 3}, 10));
    }

    @Test
    void testCase2() {
        assertFalse(FindSumTwoValues.find_sum_of_two(new int[]{5, 7, 1, 2, 8, 4, 3}, 19));
    }

    @Test
    void testCase3() {
        assertFalse(FindSumTwoValues.find_sum_of_two(new int[]{2, 1, 8, 4, 7, 3}, 1));
    }

    @Test
    void testCase4() {
        assertFalse(FindSumTwoValues.find_sum_of_two(new int[]{2, 1, 8, 4, 7, 3}, 2));
    }
}