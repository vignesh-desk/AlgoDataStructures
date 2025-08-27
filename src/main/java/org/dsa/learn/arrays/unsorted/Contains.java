package org.dsa.learn.arrays.unsorted;

import java.util.HashSet;
import java.util.Set;

// Store numbers in a HashSet. Each lookup is O(1), so duplicates can be detected efficiently.
public class Contains {
    public static boolean duplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
