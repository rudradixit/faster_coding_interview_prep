package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TestMergeOverlappingIntervals {
    @Test
    void testCase1() {
        ArrayList<MergeOverlappingIntervals.Tuple<Integer, Integer>> input = new ArrayList<>();
        input.add(new MergeOverlappingIntervals.Tuple<>(1, 5));
        input.add(new MergeOverlappingIntervals.Tuple<>(3, 7));
        input.add(new MergeOverlappingIntervals.Tuple<>(4, 6));
        input.add(new MergeOverlappingIntervals.Tuple<>(6, 8));

        ArrayList<MergeOverlappingIntervals.Tuple<Integer, Integer>> results = MergeOverlappingIntervals.merge_intervals(input);
        assertNotNull(results);
        assertEquals(1, results.size());
        assertEquals(new MergeOverlappingIntervals.Tuple<>(1, 8), results.get(0));
    }

    @Test
    void testCase2() {
        ArrayList<MergeOverlappingIntervals.Tuple<Integer, Integer>> input = new ArrayList<>();
        input.add(new MergeOverlappingIntervals.Tuple<>(1, 5));
        input.add(new MergeOverlappingIntervals.Tuple<>(6, 8));

        ArrayList<MergeOverlappingIntervals.Tuple<Integer, Integer>> results = MergeOverlappingIntervals.merge_intervals(input);
        assertNotNull(results);
        assertEquals(2, results.size());
        assertEquals(new MergeOverlappingIntervals.Tuple<>(1, 5), results.get(0));
        assertEquals(new MergeOverlappingIntervals.Tuple<>(6, 8), results.get(1));
    }

    @Test
    void testCase3() {
        ArrayList<MergeOverlappingIntervals.Tuple<Integer, Integer>> input = new ArrayList<>();
        input.add(new MergeOverlappingIntervals.Tuple<>(2, 10));
        input.add(new MergeOverlappingIntervals.Tuple<>(4, 12));
        input.add(new MergeOverlappingIntervals.Tuple<>(13, 16));
        input.add(new MergeOverlappingIntervals.Tuple<>(19, 20));
        input.add(new MergeOverlappingIntervals.Tuple<>(20, 24));

        ArrayList<MergeOverlappingIntervals.Tuple<Integer, Integer>> results = MergeOverlappingIntervals.merge_intervals(input);
        assertNotNull(results);
        assertEquals(3, results.size());
        assertEquals(new MergeOverlappingIntervals.Tuple<>(2, 12), results.get(0));
        assertEquals(new MergeOverlappingIntervals.Tuple<>(13, 16), results.get(1));
        assertEquals(new MergeOverlappingIntervals.Tuple<>(19, 24), results.get(2));
    }
}