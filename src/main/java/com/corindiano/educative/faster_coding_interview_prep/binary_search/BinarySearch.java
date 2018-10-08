package com.corindiano.educative.faster_coding_interview_prep.binary_search;

public class BinarySearch {
    static int binarySearchRec(int[] a, int key, int start, int end) {
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

    public static void main(String []args){
        int[] arr1 = {1,2,4,7,8,12,15,19,24,50,69,80,100};
        System.out.println("Key(12) found at: "+binSearch(arr1,12));
        System.out.println("Key(44) found at: "+binSearch(arr1,44));
        System.out.println("Key(80) found at: "+binSearch(arr1,80));
    }
}