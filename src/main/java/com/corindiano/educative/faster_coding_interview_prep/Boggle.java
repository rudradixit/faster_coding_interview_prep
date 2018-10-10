package com.corindiano.educative.faster_coding_interview_prep;

import java.util.HashSet;
import java.util.Set;

class Boggle {
    private char[][] grid;
    private Set<String> dictionary;

    Boggle(char[][] grid, Set<String> dictionary) {
        this.grid = grid;
        this.dictionary = dictionary;
    }

    private void find_all_words(Set<String> results, boolean[][] used, int row, int col, String str) {
        if (row < 0 || row >= grid.length) return;
        if (col < 0 || col >= grid[row].length) return;
        if (used[row][col]) return;

        used[row][col] = true;
        str += grid[row][col];

        if (dictionary.contains(str)) {
            results.add(str);

            for (int i=-1; i<=1; i++) {
                find_all_words(results, used, row+i, col+i, str);
            }
        }

        used[row][col] = false;
    }

    Set<String> find_all_words() {
        Set<String> result = new HashSet<>();
        boolean[][] used = new boolean[grid.length][grid.length];
        find_all_words(result, used, 0, 0, "");
        return result;
    }
}