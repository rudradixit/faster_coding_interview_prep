package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestRemoveDuplicates {
    @Test
    void testCase1() {
        char[] input = "aabcdcdcdddefg".toCharArray();
        RemoveDuplicates.remove_duplicates(input);
        assertEquals("abcdefg\0\0\0\0\0\0\0", new String(input));
    }

    @Test
    void testCase2() {
        char[] input = "qwertyuiop".toCharArray();
        RemoveDuplicates.remove_duplicates(input);
        assertEquals("qwertyuiop", new String(input));
    }
}