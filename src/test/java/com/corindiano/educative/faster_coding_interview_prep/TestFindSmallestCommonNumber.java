package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestFindSmallestCommonNumber {
    @Test
    void testCase1() {
        int[] a = new int[]{6, 7, 10, 25, 30, 63, 64};
        int[] b = new int[]{-1, 4, 5, 16, 7, 8, 30, 50};
        int[] c = new int[]{1, 6, 10, 14, 30};

        assertEquals(30, FindSmallestCommonNumber.find_least_common_number(a, b, c));
    }

    @Test
    void testCase2() {
        int[] a = new int[]{1, 6, 10, 14, 50};
        int[] b = new int[]{-1, 6, 7, 8, 50};
        int[] c = new int[]{0, 6, 7, 10, 25, 30, 40};

        assertEquals(6, FindSmallestCommonNumber.find_least_common_number(a, b, c));
    }
}