package com.nathan422.p03TwoSum;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    public void findsIndexWhenFirstTwoElements() {
        TwoSum calc = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;

       assertArrayEquals(new int[]{0,1}, calc.twoSum(nums, target));
    }
    @Test
    public void findsIndexWhenFinalTwoElements() {
        TwoSum calc = new TwoSum();
        int[] nums = {3,2,4};
        int target =6;

        assertArrayEquals(new int[]{1,2}, calc.twoSum(nums, target));
    }
    @Test
    public void findsIndexWhenOnlyTwoElements() {
        TwoSum calc = new TwoSum();
        int[] nums = {3,3};
        int target = 6;

        assertArrayEquals(new int[]{0,1}, calc.twoSum(nums, target));
    }
    @Test
    public void findsIndexWhenSecondAndThirdElements() {
        TwoSum calc = new TwoSum();
        int[] nums = {3,2,4,7,8};
        int target = 6;

        assertArrayEquals(new int[]{1,2}, calc.twoSum(nums, target));
    }
}