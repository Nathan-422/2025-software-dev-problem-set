package com.nathan422.p05TopKElement;

import java.util.HashMap;
import java.util.Map;

public class TopKElement {
    public int[] topKFrequent(int[] nums, int k) {

        // count in O(n) time
        Map<Integer, Integer> counts = new HashMap<>(); // 1 indexed
        for (int i : nums) {
            if (counts.containsKey(i) ) {
                counts.putIfAbsent(i, 1);
                continue;
            }
            counts.put(i, counts.get(i) + 1);
        }

        // assign to bucket sort array
        int[] countsAsIndexArray = new int[nums.length];    // 0 indexed
        for (int key : counts.keySet()) {
            countsAsIndexArray[counts.get(key) - 1] = key;
        }

        // Write most frequent items to output array
        int[] output = new int[k];
        int remainingNumbers = k;   // 1 indexed.  Will be subtracted from until output is full
        for (int i = countsAsIndexArray.length - 1; i >= 0; i--) {
            if (countsAsIndexArray[i] == 0) continue;

            output[remainingNumbers - 1] = countsAsIndexArray[i];
            remainingNumbers = remainingNumbers--;

            if (remainingNumbers == 0) break;
        }

        return output;
    }
}
