package org.dsa.learn.arrays.unsorted;

import org.dsa.Main;

/**
 * Problem: 53. Maximum Subarray
 * <p>
 * Statement:
 *   Given an integer array nums, find the contiguous subarray (containing at least one number)
 *   which has the largest sum and return its sum.
 * <p>
 * Example:
 *   Input:  [-2,1,-3,4,-1,2,1,-5,4]
 *   Output: 6
 *   Explanation: [4,-1,2,1] has the largest sum = 6.
 * <p>
 * Constraints:
 *   - 1 <= nums.length <= 10^5
 *   - -10^4 <= nums[i] <= 10^4
 * <p>
 * Approach:
 *   - Use Kadane's Algorithm.
 *   - Iterate through nums, maintaining current subarray sum and maximum sum so far.
 *   - Time Complexity: O(n)
 *   - Space Complexity: O(1)
 */

// Since it is sorted, Binary Search will help to solve the problem in O(log n)
public class MaximumSubArray {
    public static int get(int[] nums) {
        var index = 1;
        var curr_sum = nums[0]; var max_sum = nums[0];

        if (nums.length == 1) return max_sum;

        while(index < nums.length) {
            curr_sum = Math.max(nums[index], curr_sum+nums[index]);
            max_sum = Math.max(max_sum, curr_sum);
            index++;
        }
        return max_sum;
    }
}
