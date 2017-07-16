package main.other;

public class IndexAbs {

    public int getAbsIndex(int[] N) {

        int max = 0;
        int result = -1;
        top: for (int top_index = 0; top_index + max <= N.length; top_index++) {
            for (int bottom_index = N.length - 1; bottom_index > top_index + max; bottom_index--) {
                if (N[top_index] == N[bottom_index]) {
                    max = Math.abs(top_index - bottom_index);
                    result = max;
                    continue top;
                }
            }
        }

        return result;
    }
}
