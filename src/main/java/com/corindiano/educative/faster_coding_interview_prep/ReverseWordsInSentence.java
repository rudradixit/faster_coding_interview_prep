package com.corindiano.educative.faster_coding_interview_prep;

class ReverseWordsInSentence {
    private static void reverse(char[] input, int left, int right) {
        while (left < right) {
            char t = input[left];
            input[left] = input[right];
            input[right] = t;
            left++;
            right--;
        }
    }

    static void reverse_words (char[] sentence) {
        reverse(sentence, 0, sentence.length-1);
        int left = 0;
        int right;

        for (right=0; right<sentence.length; right++) {
            if (sentence[right] == ' ') {
                reverse(sentence, left, right-1);
                left = right+1;
            }
        }

        if (left < right) {
            reverse(sentence, left, right-1);
        }
    }
}