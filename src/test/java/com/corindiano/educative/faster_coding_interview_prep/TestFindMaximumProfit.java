package com.corindiano.educative.faster_coding_interview_prep;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestFindMaximumProfit {
    @Test
    void testCase1() {
        int[] input = new int[] {8, 5, 12, 9, 19, 1};
        FindMaximumProfit.Tuple<Integer, Integer> expected = new FindMaximumProfit.Tuple<>(5, 19);
        assertEquals(expected, FindMaximumProfit.find_buy_sell_stock_prices(input));
    }

    @Test
    void testCase2() {
        int[] input = new int[] {21, 12, 11, 9, 6, 3};
        FindMaximumProfit.Tuple<Integer, Integer> expected = new FindMaximumProfit.Tuple<>(12, 11);
        assertEquals(expected, FindMaximumProfit.find_buy_sell_stock_prices(input));
    }
}