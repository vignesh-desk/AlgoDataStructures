package org.dsa.learn.arrays.sorted;

public class TwoSum {

    // Since the given array is sorted, I decided to use the two-pointer approach.
    public static int[] findIndexOfTwoSum(int[] nums, int target) {
        int left = 0; int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            }
            if (sum < target) {
                left++;
            }else  {
                right--;
            }
        }
        return new int[]{};
    }
}
