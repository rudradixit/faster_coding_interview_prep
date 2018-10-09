package com.corindiano.educative.faster_coding_interview_prep;

import java.util.HashSet;
import java.util.Set;

class FindSumTwoValues {
    static boolean slower_find_sum_of_two(int[] A, int val) {
        Set<Integer> map = new HashSet<>();

        for (int a : A) {
            if (a <= val) map.add(a);
        }

        for (int a : A) {
            if (a > val) continue;

            int diff = val - a;
            map.remove(a);
            if (map.contains(diff)) return true;
            map.add(a);
        }

        return false;
    }

    static boolean find_sum_of_two(int[] A, int val) {
        int left = 0, right = A.length - 1;
        int sum;

        while (left < right) {
            sum = A[left] + A[right];

            if (sum == val) return true;
            else if (sum > val) right--;
            else left++;
        }

        return false;
    }

}