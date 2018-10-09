package com.corindiano.educative.faster_coding_interview_prep;

import java.util.HashSet;
import java.util.Set;

class RemoveDuplicates {
    static void remove_duplicates(char[] str) {
        Set<Character> mem = new HashSet<>();
        int read = 0, write = 0;

        while (read < str.length || write < str.length) {
            if (read >= str.length) {
                str[write++] = '\0';
            } else {
                if (!mem.contains(str[read])) {
                    mem.add(str[read]);
                    str[write] = str[read];
                    write++;
                }

                read++;
            }
        }
    }
}