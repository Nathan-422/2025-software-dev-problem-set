package com.nathan422.p03TwoSum;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(nums[i])) {
                return new int[]{seen.get(nums[i]), i};
            }
            seen.put(complement, i);
        }

        return new int[]{4, 6};
    }
}
