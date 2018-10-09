package com.corindiano.educative.faster_coding_interview_prep;

import java.util.Set;

class StringSegmentation {
    private static boolean can_segment_string(String s, Set<String> dict, int start, int end) {
        String sub = s.substring(start, end);

        if (end == s.length()) {
            return dict.contains(sub);
        }

        if (can_segment_string(s, dict, end, end + 1)) return true;
        else return can_segment_string(s, dict, start, end + 1);
    }

    static boolean can_segment_string(String s, Set<String> dict) {
        return can_segment_string(s, dict, 0, 1);
    }
}