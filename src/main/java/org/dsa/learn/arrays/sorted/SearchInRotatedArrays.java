package org.dsa.learn.arrays.sorted;

public class SearchInRotatedArrays {
    public static int search(int[] nums, int target) {
        // 4,5,6,7,0,1,2
        if (nums == null || nums.length == 0) {return -1;}
        int leftIndex = 0; int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            int midIndex = (leftIndex + rightIndex) / 2;
            if (nums[midIndex] == target) {
                return midIndex;
            }

            // Check if left half is sorted
            if (nums[leftIndex] <= nums[midIndex]) {
                if (nums[leftIndex] <= target && target < nums[midIndex]) {
                    rightIndex = midIndex - 1;
                } else {
                    leftIndex = midIndex + 1;
                }
            }
            // Right half is sorted
            else {
                if (nums[midIndex] < target && target <= nums[rightIndex]) {
                    leftIndex = midIndex + 1;
                } else {
                    rightIndex = midIndex - 1;
                }
            }
        }
        return -1;
    }
}
