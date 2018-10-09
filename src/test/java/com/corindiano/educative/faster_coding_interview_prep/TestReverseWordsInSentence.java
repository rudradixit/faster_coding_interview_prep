package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestReverseWordsInSentence {
    @Test
    void testCase1() {
        char[] input = "Hello World".toCharArray();
        char[] output = "World Hello".toCharArray();
        ReverseWordsInSentence.reverse_words(input);
        assertArrayEquals(output, input);
    }

    @Test
    void testCase2() {
        char[] input = "The quick brown fox jumped over the lazy dog.".toCharArray();
        char[] output = "dog. lazy the over jumped fox brown quick The".toCharArray();
        ReverseWordsInSentence.reverse_words(input);
        assertArrayEquals(output, input);
    }
}