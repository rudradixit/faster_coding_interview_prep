package com.corindiano.educative.faster_coding_interview_prep;

class RemoveWhitespaces {
    static void remove_white_spaces(char[] str) {
        int read = 0, write = 0;

        while (read < str.length || write < str.length) {
            if (read >= str.length) {
                str[write++] = '\0';
            } else {
                if (str[read] == ' ') {
                    read++;
                } else {
                    str[write++] = str[read++];
                }
            }
        }
    }
}