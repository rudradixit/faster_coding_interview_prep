package com.corindiano.educative.faster_coding_interview_prep;

class Fibonacci {
    static int get_fibonacci(int n) {
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}