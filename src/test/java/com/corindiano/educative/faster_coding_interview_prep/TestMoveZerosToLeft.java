package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMoveZerosToLeft {
    @Test
    void testCase1() {
        int[] input = new int[] {1, 10, 20, 0, 59, 63, 0, 88, 0};
        int[] expected = new int[] {0, 0, 0, 1, 10, 20, 59, 63, 88};
        MoveZerosToLeft.move_zeros_to_left_in_array(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testCase2() {
        int[] input = new int[] {1, 10, 20, 30, 59, 63, 40, 88, 50};
        int[] expected = new int[] {1, 10, 20, 30, 59, 63, 40, 88, 50};
        MoveZerosToLeft.move_zeros_to_left_in_array(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void testCase3() {
        int[] input = new int[] {0, 0, 0, 0};
        int[] expected = new int[] {0, 0, 0, 0};
        MoveZerosToLeft.move_zeros_to_left_in_array(input);
        assertArrayEquals(expected, input);
    }
}