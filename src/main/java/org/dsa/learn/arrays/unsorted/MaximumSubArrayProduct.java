package org.dsa.learn.arrays.unsorted;

/**
 * Problem: 152. Maximum Product Subarray
 * <p>
 * Statement:
 *   Given an integer array nums, find the contiguous subarray within an array (containing at least one number)
 *   which has the largest product, and return the product.
 * <p>
 * Example:
 *   Input:  [2,3,-2,4]
 *   Output: 6
 *   Explanation: [2,3] has the largest product = 6.
 * <p>
 * Constraints:
 *   - 1 <= nums.length <= 2 * 10^4
 *   - -10 <= nums[i] <= 10
 *   - The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer
 * <p>
 * Approach:
 *   - Use a variant of Kadane’s Algorithm that tracks both maximum and minimum products at each step.
 *   - Time Complexity: O(n)
 *   - Space Complexity: O(1)
 */

public class MaximumSubArrayProduct {
    public static int get(int[] nums) {
        var len = nums.length;
        var max = nums[0]; var left = 1; var right = 1;
        for (int i = 0; i < len; i++) {
            // If 0 is present will reset the value to 1, so that its starts fresh again
            left = left == 0 ? 1 : left;
            right = right == 0 ? 1 : right;

            left *= nums[i];
            right *= nums[len-1-i];
            max = Math.max(max, Math.max(left, right));
        }
        return max;
    }
}
