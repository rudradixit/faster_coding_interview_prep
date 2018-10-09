package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestFindLowHigh {
    private List<Integer> list = Arrays.asList(1, 2, 5, 5, 5, 5, 5, 5, 5, 5, 20);

    @Test
    void testCase1() {
        assertEquals(0, FindLowHigh.find_low_index(list, 1));
        assertEquals(0, FindLowHigh.find_high_index(list, 1));
    }

    @Test
    void testCase2() {
        assertEquals(1, FindLowHigh.find_low_index(list, 2));
        assertEquals(1, FindLowHigh.find_high_index(list, 2));
    }

    @Test
    void testCase3() {
        assertEquals(2, FindLowHigh.find_low_index(list, 5));
        assertEquals(9, FindLowHigh.find_high_index(list, 5));
    }

    @Test
    void testCase4() {
        assertEquals(10, FindLowHigh.find_low_index(list, 20));
        assertEquals(10, FindLowHigh.find_high_index(list, 20));
    }
}