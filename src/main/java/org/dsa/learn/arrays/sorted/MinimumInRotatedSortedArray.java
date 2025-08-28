package org.dsa.learn.arrays.sorted;

public class MinimumInRotatedSortedArray {
    public static int get(int[] nums) {
        var leftIndex = 0; var rightIndex = nums.length - 1;

        while (leftIndex < rightIndex) {
            var midIndex = (leftIndex + rightIndex) / 2;
            if (nums[midIndex] > nums[rightIndex]) {
                leftIndex = midIndex + 1;
            } else  {
                rightIndex = midIndex;
            }
        }
        return nums[leftIndex];
    }
}
