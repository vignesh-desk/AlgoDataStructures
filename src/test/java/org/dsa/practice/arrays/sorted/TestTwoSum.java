package org.dsa.practice.arrays.sorted;

import org.dsa.learn.arrays.sorted.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTwoSum {
    @Test
    public void find_twoSum_index() {
        var nums = new int[]{2, 7, 11, 15}; var target = 9;
        final var my_result = TwoSum.findIndexOfTwoSum(nums, target);

        // Derive your solution here and replace the hard coded result
        var your_result = new int[]{0, 1};

        Assertions.assertArrayEquals(your_result, my_result);
    }
}
