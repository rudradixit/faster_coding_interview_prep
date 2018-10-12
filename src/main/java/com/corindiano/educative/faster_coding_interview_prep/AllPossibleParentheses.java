package com.corindiano.educative.faster_coding_interview_prep;

import java.util.HashSet;
import java.util.Set;

class AllPossibleParentheses {
    private static final String OPEN = "{";
    private static final String CLOSE = "}";

    private static void _printAllParentheses(Set<String> results, String str, int open, int close, int n) {
        if (str.length() == 2*n) {
            results.add(str);
            return;
        }

        if (open < n) {
            _printAllParentheses(results, str + OPEN, open+1, close, n);
        }

        if (close < open) {
            _printAllParentheses(results, str + CLOSE, open, close+1, n);
        }
    }

    static Set<String> printAllParentheses(int n) {
        Set<String> results = new HashSet<>();
        _printAllParentheses(results, "", 0, 0, n);
        return results;
    }
}