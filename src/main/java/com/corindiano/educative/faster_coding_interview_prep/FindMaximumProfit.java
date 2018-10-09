package com.corindiano.educative.faster_coding_interview_prep;

class FindMaximumProfit {
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

    static Tuple<Integer, Integer> find_buy_sell_stock_prices(int[] array) {
        int min = Math.min(array[0], array[1]);
        int diff = array[1] - array[0];
        int x = array[0];
        int y = array[1];

        for (int i=2; i<array.length; i++) {
            if (array[i] - min > diff) {
                y = array[i];
                x = min;
                diff = y - x;
            }

            min = Math.min(array[i], min);
        }

        return new Tuple<>(x, y);
    }
}