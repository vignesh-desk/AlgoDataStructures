package org.dsa.practice.arrays.unsorted;

import org.dsa.learn.arrays.sorted.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTwoSumUnSorted {
    @Test
    public void testFindIndexOfTwoSum_Unsorted() {
        var nums = new int[]{2, 11, 7, 15};
        var target = 9;
        var my_result = TwoSum.findIndexOfTwoSum(nums, target);

        // Derive your solution here and replace the hard coded result
        var your_result = new int[]{0, 2};

        Assertions.assertArrayEquals(my_result, your_result);
    }
}
