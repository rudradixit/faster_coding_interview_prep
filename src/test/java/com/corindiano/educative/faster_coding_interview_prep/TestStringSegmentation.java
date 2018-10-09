package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestStringSegmentation {
    @Test
    void testCase1() {
        Set<String> dict = new HashSet<String>() {{ add("apple"); add("pear"); add("pie"); add("pier"); }};
        assertTrue(StringSegmentation.can_segment_string("applepear", dict));
    }

    @Test
    void testCase2() {
        Set<String> dict = new HashSet<String>() {{ add("apple"); add("pear"); add("pie"); add("pier"); }};
        assertFalse(StringSegmentation.can_segment_string("applepeer", dict));
    }

    @Test
    void testCase3() {
        Set<String> dict = new HashSet<String>() {{ add("be"); add("bed"); add("bath"); add("beyond"); add("and"); add("hand"); }};
        assertTrue(StringSegmentation.can_segment_string("bedbathandbeyond", dict));
    }
}