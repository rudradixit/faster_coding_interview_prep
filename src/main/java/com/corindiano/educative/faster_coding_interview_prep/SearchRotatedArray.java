package com.corindiano.educative.faster_coding_interview_prep;

class SearchRotatedArray {
    private static int bin_search_rec(int[] arr, int key, int start, int end) {
        if (start == end) return (arr[start] == key) ? start : -1;

        int mid = start + (end - start) / 2;
        if (arr[mid] == key) return mid;

        if (arr[start] < arr[end]) {
            if (arr[mid] > key) return bin_search_rec(arr, key, start, mid);
            else return bin_search_rec(arr, key, mid+1, end);
        } else {
            int left = bin_search_rec(arr, key, start, mid);
            if (left != -1) return left;
            else return bin_search_rec(arr, key, mid+1, end);
        }
    }

    static int binary_search_rotated(int[] arr,int key) {
        return bin_search_rec(arr, key, 0, arr.length-1);
    }
}