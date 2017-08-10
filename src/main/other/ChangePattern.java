package main.other;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChangePattern {

    final int[] KAHEI = { 10000, 5000, 1000, 500, 100, 50, 10, 5 };
    private int pattern;
    private Map<List<Integer>, Integer> memoMap = new HashMap<>();
    int calcResult;

    public int getPattern(int amt) {
        pattern = 0;

        calcPattern(amt, 0);

        return pattern;
    }

    private int calcPattern(int amt, int idxKahei) {

        if (idxKahei >= KAHEI.length || amt == 0) {
            pattern++;
            return 1;
        }

        for (int numKahei = 0; numKahei <= amt / KAHEI[idxKahei]; numKahei++) {
            // メモ化用キー作成
            List<Integer> keyList = new ArrayList<>();
            keyList.add(KAHEI[idxKahei]);
            keyList.add(numKahei);

            if (memoMap.containsKey(keyList)) {
                calcResult = memoMap.get(keyList);
                pattern += calcResult;
            } else {
                calcResult += calcPattern(amt - (KAHEI[idxKahei] * numKahei), idxKahei + 1);
                memoMap.put(keyList, calcResult);
            }
        }

        return calcResult;
    }
}
