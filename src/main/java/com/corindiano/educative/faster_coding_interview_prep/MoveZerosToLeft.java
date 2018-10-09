package com.corindiano.educative.faster_coding_interview_prep;

class MoveZerosToLeft {
    static void slow_move_zeros_to_left_in_array(int[] a) {
        int swap = 0;

        for (int i=0; i<a.length; i++) {
            if (a[i] != 0) continue;

            for (int j=i; j>0; j--) a[j] = a[j-1];
            a[swap] = 0;
            swap++;
        }
    }

    static void move_zeros_to_left_in_array(int[] a) {
        int read = a.length-1, write = a.length-1;

        while (read >= 0 || write >= 0) {
            if (read < 0) {
                a[write] = 0;
                write--;
            } else {
                if (a[read] != 0) {
                    a[write] = a[read];
                    write--;
                }

                read--;
            }
        }
    }
}