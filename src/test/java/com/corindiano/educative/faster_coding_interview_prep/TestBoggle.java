package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

class TestBoggle {
    @Test
    void testCase0() {
        char[][] grid = {
            {'c', 'a'},
            {'t', 'r'}
        };

        Set<String> dict = new HashSet<>();
        dict.add("cat");
        dict.add("cart");
        dict.add("car");
        dict.add("tar");
        dict.add("rat");

        Set<String> expected = new HashSet<>();
        expected.add("cat");
        expected.add("cart");
        expected.add("car");
        expected.add("tar");
        expected.add("rat");

        Boggle boggle = new Boggle(grid, dict);
        Set<String> results = boggle.find_all_words();
        assertNotNull(results);
        assertEquals(5, expected.size());

        for (String r : results) {
            if (!expected.contains(r)) fail("Invalid result!");
        }
    }

    @Test
    void testCase1() {
        char[][] grid = {
            {'c', 'a', 't'},
            {'r', 'r', 'e'},
            {'t', 'o', 'n'}
        };

        Set<String> dict = new HashSet<>();
        dict.add("cat");
        dict.add("cater");
        dict.add("art");
        dict.add("toon");
        dict.add("moon");
        dict.add("not");
        dict.add("eat");
        dict.add("ton");

        Set<String> expected = new HashSet<>();
        expected.add("cat");
        expected.add("cater");
        expected.add("art");
        expected.add("not");
        expected.add("eat");
        expected.add("ton");

        Boggle boggle = new Boggle(grid, dict);
        Set<String> results = boggle.find_all_words();
        assertNotNull(results);
        assertEquals(6, expected.size());

        for (String r : results) {
            if (!expected.contains(r)) fail("Invalid result!");
        }
    }

    @Test
    void testCase2() {
        char[][] grid = {
            {'p', 'p', 'p'},
            {'i', 'a', 'l'},
            {'n', 'e', 'e'}
        };

        Set<String> dict = new HashSet<>();
        dict.add("pi");
        dict.add("pin");
        dict.add("pine");
        dict.add("pale");
        dict.add("pane");
        dict.add("pineapple");
        dict.add("apple");
        dict.add("app");
        dict.add("plea");
        dict.add("grass");

        Set<String> expected = new HashSet<>();
        expected.add("pi");
        expected.add("pin");
        expected.add("pine");
        expected.add("pale");
        expected.add("pane");
        expected.add("pineapple");
        expected.add("apple");
        expected.add("app");
        expected.add("plea");

        Boggle boggle = new Boggle(grid, dict);
        Set<String> results = boggle.find_all_words();
        assertNotNull(results);
        assertEquals(9, expected.size());

        for (String r : results) {
            if (!expected.contains(r)) fail("Invalid result!");
        }
    }
}