package com.corindiano.educative.faster_coding_interview_prep;

class BinarySearch {
    private static int binarySearchRec(int[] a, int key, int start, int end) {
        if (start > end) return -1;
        if (start == end) return a[start] == key ? start : -1;

        int mid = start + (end - start) / 2;

        if (a[mid] == key) return mid;
        if (a[mid] > key) return binarySearchRec(a, key, start, mid);
        return binarySearchRec(a, key, mid + 1, end);
    }

    static int binSearch(int[] a, int key) {
        return binarySearchRec(a, key, 0, a.length - 1);
    }
}