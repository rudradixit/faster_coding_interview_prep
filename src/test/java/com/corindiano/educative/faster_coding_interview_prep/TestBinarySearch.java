package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBinarySearch {
    private int[] arr1 = {1,2,4,7,8,12,15,19,24,50,69,80,100};

    @Test
    void testCase1() {
        assertEquals(5, BinarySearch.binSearch(arr1, 12));
    }

    @Test
    void testCase2() {
        int[] arr1 = {1,2,4,7,8,12,15,19,24,50,69,80,100};
        assertEquals(-1, BinarySearch.binSearch(arr1, 44));
    }

    @Test
    void testCase3() {
        int[] arr1 = {1,2,4,7,8,12,15,19,24,50,69,80,100};
        assertEquals(11, BinarySearch.binSearch(arr1, 80));
    }
}