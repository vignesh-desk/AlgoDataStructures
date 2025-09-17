package org.dsa.learn.arrays.unsorted;
import static java.lang.Math.abs;

public class FirstMissingPositive {
    public static int get(int[] nums) {
        if (nums == null || nums.length == 0) { return 1; }
        var len = nums.length; var right = len - 1; var isContainsOne = false;

        for (int j : nums) {
            if (j == 1) {
                isContainsOne = true;
                break;
            }
        }
        if(!isContainsOne) return 1;
        if(nums.length == 1) return 2;

        for (int i = 0; i <= right; i++) {
            if (nums[i] <= 0 || nums[i] > len) {
                nums[i] = 1;
            }
        }

        for (int i = 0; i < len; i++) {
            var num = abs(nums[i]);
            if (nums[num - 1] > 0)  {
                nums[num - 1] *= -1;
            }
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return len + 1;
    }
}
