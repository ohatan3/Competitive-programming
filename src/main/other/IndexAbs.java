/**
 * ＜問題＞
 * 整数型の配列の内、同じ値が格納されている要素のインデックス同士の絶対値を求める。
 * 配列に同じ値がない場合は、-1を返却すること。
 *
 * ＜例＞
 * 入力値 -> 期待値
 * ・[1,2,3,4,5,6,7] -> -1
 * ・[1,2,3,4,5,6,1] -> 6
 * ・[1,2,3,2,1,1,7] -> 5
 *
 */
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
