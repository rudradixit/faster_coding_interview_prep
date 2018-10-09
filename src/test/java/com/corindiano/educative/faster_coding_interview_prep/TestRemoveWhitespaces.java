package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestRemoveWhitespaces {
    @Test
    void testCase1() {
        char[] input = "The book is on the table".toCharArray();
        RemoveWhitespaces.remove_white_spaces(input);
        assertEquals("Thebookisonthetable\0\0\0\0\0", new String(input));
    }
}