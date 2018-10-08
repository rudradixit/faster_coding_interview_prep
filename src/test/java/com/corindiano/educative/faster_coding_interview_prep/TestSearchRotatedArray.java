package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSearchRotatedArray {
    @Test
    void testCase1() {
        assertEquals(4, SearchRotatedArray.binary_search_rotated(new int[]{6, 7, 1, 2, 3, 4, 5}, 3));
    }

    @Test
    void testCase2() {
        assertEquals(5, SearchRotatedArray.binary_search_rotated(new int[]{4, 5, 6, 1, 2, 3}, 3));
    }

    @Test
    void testCase3() {
        assertEquals(2, SearchRotatedArray.binary_search_rotated(new int[]{4, 5, 6, 1, 2, 3}, 6));
    }

    @Test
    void testCase4() {
        assertEquals(0, SearchRotatedArray.binary_search_rotated(new int[]{6, 7, 1, 2, 3, 4, 5}, 6));
    }
}