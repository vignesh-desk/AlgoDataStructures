package org.dsa.learn.arrays.unsorted;

/**
 * Problem: 238. Product of Array Except Self
 * <p>
 * Statement:
 *   Given an integer array nums, return an array answer such that answer[i] is
 *   equal to the product of all the elements of nums except nums[i].
 *   You must write an algorithm that runs in O(n) and without using division.
 * <p>
 * Example:
 *   Input:  [1,2,3,4]
 *   Output: [24,12,8,6]
 * <p>
 * Constraints:
 *   - 2 <= nums.length <= 10^5
 *   - -30 <= nums[i] <= 30
 * <p>
 * Approach:
 *   - Compute prefix and suffix products.
 *   - Multiply prefix[i] and suffix[i] to get result[i].
 *   - Time Complexity: O(n)
 *   - Space Complexity: O(n) (or O(1) if optimized).
 */
// You must write an algorithm that runs in O(n) time and without using the division operation.

public class ProductExceptSelf {
     public static int[] get(int[] nums) {
        var pre_arr = new int[nums.length]; var post_arr = new int[nums.length];
        var result_arr = new int[nums.length];
        pre_arr [0] = 1; post_arr [nums.length-1] = 1;
        for(int i = 1; i < nums.length; i++) {
            pre_arr[i] = pre_arr[i - 1] * nums[i - 1];
        }

        for(int j = nums.length - 2; j >= 0; j--) {
            post_arr[j] = post_arr[j + 1] * nums[j + 1];
        }

        for(int k = 0; k < nums.length; k++) {
            result_arr[k] = pre_arr[k] * post_arr[k];
        }
        return result_arr;
    }
}
