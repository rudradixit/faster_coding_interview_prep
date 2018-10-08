package com.corindiano.educative.faster_coding_interview_prep;

import java.util.PriorityQueue;

class FindSmallestCommonNumber {
    private static boolean binSearch(int[] array, int val, int start, int end) {
        if (start > end) return false;

        int mid = start + (end - start) / 2;
        if (array[mid] == val) return true;
        if (array[mid] > val) return binSearch(array, val, start, mid-1);
        return binSearch(array, val, mid+1, end);
    }

    private static class Elem implements Comparable<Elem> {
        private int index, val;

        private Elem(int index, int val) {
            this.index = index;
            this.val = val;
        }


        @Override
        public int compareTo(Elem o) {
            if (this.index == o.index && this.val == o.val) return 0;
            return Integer.compare(this.index, o.index);
        }
    }

    static int slow_find_least_common_number(int[] arr1, int[] arr2, int[] arr3) {
        int l1 = 0, l2 = 0, l3 = 0;

        PriorityQueue<Elem> minHeap = new PriorityQueue<>();

        while (l1 < arr1.length && l2 < arr2.length && l3 < arr3.length) {
            if (l1 < arr1.length) minHeap.offer(new Elem(1, arr1[l1]));
            if (l2 < arr2.length) minHeap.offer(new Elem(2, arr2[l2]));
            if (l3 < arr3.length) minHeap.offer(new Elem(3, arr3[l3]));

            Elem minElem = minHeap.poll();

            if (minElem == null) return -1;

            if (minElem.index == 1) {
                if (binSearch(arr2, minElem.val, 0, arr2.length - 1) &&
                    binSearch(arr3, minElem.val, 0, arr3.length)) return minElem.val;

                l1++;
            } else if (minElem.index == 2) {
                if (binSearch(arr1, minElem.val, 0, arr1.length - 1) &&
                    binSearch(arr3, minElem.val, 0, arr3.length)) return minElem.val;

                l2++;
            } else {
                if (binSearch(arr1, minElem.val, 0, arr1.length - 1) &&
                    binSearch(arr2, minElem.val, 0, arr2.length)) return minElem.val;

                l3++;
            }
        }

        return -1;
    }

    static int find_least_common_number(int[] arr1, int[] arr2, int[] arr3) {
        int l1=0, l2=0, l3=0;

        while (l1 < arr1.length && l2 < arr2.length && l3 < arr3.length) {
            if (arr1[l1] == arr2[l2] && arr2[l2] == arr3[l3]) return arr1[l1];

            if (arr1[l1] <= arr2[l2] && arr1[l1] <= arr3[l3]) {
                l1++;
            } else if (arr2[l2] <= arr1[l1] && arr2[l2] <= arr3[l3]) {
                l2++;
            } else {
                l3++;
            }
        }

        return -1;
    }
}