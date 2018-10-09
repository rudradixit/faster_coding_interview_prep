package com.corindiano.educative.faster_coding_interview_prep;

import java.util.ArrayList;

class MergeOverlappingIntervals {
    static class Tuple<X, Y> {
        X x;
        Y y;

        Tuple(X x, Y y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) return false;
            if (!(obj instanceof Tuple)) return false;

            Tuple other = (Tuple) obj;
            if (other == this) return true;

            if (this.x == null && other.x != null) return false;
            if (this.x != null && other.x == null) return false;

            if (this.y == null && other.y != null) return false;
            if (this.y != null && other.y == null) return false;

            if (this.x != null && this.y != null) return (this.x.equals(other.x) && this.y.equals(other.y));
            return true;
        }
    }

    static ArrayList<Tuple<Integer, Integer>> merge_intervals(ArrayList<Tuple<Integer, Integer>> intervals) {
        ArrayList<Tuple<Integer, Integer>> results = new ArrayList<>();
        Tuple<Integer, Integer> last;

        for (Tuple<Integer, Integer> i : intervals) {
            if (results.isEmpty()) results.add(i);
            else {
                last = results.get(results.size()-1);

                if (i.x <= last.y) {
                    last.y = Math.max(last.y, i.y);
                } else {
                    results.add(i);
                }
            }
        }

        return results;
    }
}