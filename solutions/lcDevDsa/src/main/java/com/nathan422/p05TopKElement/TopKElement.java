package com.nathan422.p05TopKElement;

import java.util.HashMap;
import java.util.Map;

public class TopKElement {
    public int[] topKFrequent(int[] nums, int k) {

        // count in O(n) time
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i : nums) {
            counts.putIfAbsent(i, 1);
            counts.put(i, counts.get(i) + 1);
        }
        
        return new int[]{0,1};
    }
}
