package com.corindiano.educative.faster_coding_interview_prep;

import java.util.List;

class FindLowHigh {
    private static int find_low_index(List<Integer> arr, int key, int start, int end) {
        if (start > end) return start;

        int mid = start + (end - start)/2;
        if (arr.get(mid) >= key) return find_low_index(arr, key, start, mid-1);
        return find_low_index(arr, key, mid+1, end);
    }

    static int find_low_index(List<Integer> arr, int key) {
        return find_low_index(arr, key, 0, arr.size() - 1);
    }

    private static int find_high_index(List<Integer> arr, int key, int start, int end) {
        if (start > end) return end;

        int mid = start + (end - start)/2;
        if (arr.get(mid) <= key) return find_high_index(arr, key, mid+1, end);
        return find_high_index(arr, key, start, mid-1);
    }

    static int find_high_index(List<Integer> arr, int key) {
        return find_high_index(arr, key, 0, arr.size() - 1);
    }
}