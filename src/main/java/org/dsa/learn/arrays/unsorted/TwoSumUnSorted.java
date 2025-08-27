package org.dsa.learn.arrays.unsorted;

import java.util.HashMap;

// Since the given array is unsorted, I chose to use a hashing approach.
public class TwoSumUnSorted {
    public static int[] findIndexOfTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
