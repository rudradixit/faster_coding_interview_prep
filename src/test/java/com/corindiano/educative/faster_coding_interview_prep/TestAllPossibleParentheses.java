package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestAllPossibleParentheses {
    @Test
    void testCase1() {
        Set<String> expected = new HashSet<>();
        expected.add("{}");
        assertEquals(expected, AllPossibleParentheses.printAllParentheses(1));
    }

    @Test
    void testCase2() {
        Set<String> expected = new HashSet<>();
        expected.add("{}{}");
        expected.add("{{}}");
        assertEquals(expected, AllPossibleParentheses.printAllParentheses(2));
    }

    @Test
    void testCase3() {
        Set<String> expected = new HashSet<>();
        expected.add("{}{}{}");
        expected.add("{{}}{}");
        expected.add("{}{{}}");
        expected.add("{{}{}}");
        expected.add("{{{}}}");
        assertEquals(expected, AllPossibleParentheses.printAllParentheses(3));
    }

    @Test
    void testCase4() {
        Set<String> expected = new HashSet<>();
        expected.add("{}{}{}{}");
        expected.add("{{}}{}{}");
        expected.add("{}{{}}{}");
        expected.add("{}{}{{}}");
        expected.add("{{}{}}{}");
        expected.add("{{{}}}{}");
        expected.add("{{}}{{}}");
        expected.add("{}{{}{}}");
        expected.add("{}{{{}}}");
        expected.add("{{}{}{}}");
        expected.add("{{{}}{}}");
        expected.add("{{}{{}}}");
        expected.add("{{{}{}}}");
        expected.add("{{{{}}}}");
        assertEquals(expected, AllPossibleParentheses.printAllParentheses(4));
    }
}