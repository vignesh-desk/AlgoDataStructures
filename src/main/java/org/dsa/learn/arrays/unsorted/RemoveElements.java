package org.dsa.learn.arrays.unsorted;

/*
LeetCode 27. Remove Element

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages,
you must instead place the result in the first part of the array nums.

More formally, if there are k elements after removing the duplicates,
then the first k elements of nums should hold the final result.
It does not matter what you leave beyond the first k elements.

Return k after placing the final result in the first k slots of nums.

Do not allocate extra space for another array.
You must do this by modifying the input array in-place with O(1) extra memory.
*/

public class RemoveElements {
    public static int delete(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == val) {
                // move right pointer leftward until it finds a non-val
                while (left < right && nums[right] == val) {
                    right--;
                }
                // swap only if left < right
                if (left < right) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    right--;
                } else {
                    // left == right and nums[left] == val
                    break;
                }
            }
            left++;
        }

        return left;
    }
}
