package com.nathan422.p01ContainsDuplicates;

import java.util.Set;
import java.util.HashSet;

public class Duplicates {

    public static boolean containsDuplicates(int[] nums) {
        Set<Integer> checkedNumbers = new HashSet<Integer>();

        // checks all numbers in the input array
        for (int num : nums) {
            if (checkedNumbers.contains(num)) {
                return true;
            }

            checkedNumbers.add(num);
        }

        // only reach this when no duplicates have been found
        return false;
    }
}
