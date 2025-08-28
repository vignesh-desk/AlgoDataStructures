package org.dsa.learn.arrays.unsorted;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> get(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length -2; i++) {
            int leftIndex = i + 1;
            int rightIndex = nums.length - 1;

            while (leftIndex < rightIndex) {
                var sum = nums[i] + nums[leftIndex] + nums[rightIndex];
                if (sum == 0) {
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[leftIndex], nums[rightIndex])));
                    leftIndex++;
                    rightIndex--;
                } else if (sum > 0) {
                    rightIndex--;
                }  else {
                    leftIndex++;
                }
            }
        }
        return  new ArrayList<>(result);
    }
}
