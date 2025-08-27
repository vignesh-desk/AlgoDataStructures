package org.dsa.practice.arrays.unsorted;

import org.dsa.learn.arrays.unsorted.MaximumSubArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumSubArray {
    @Test
    public void testMaximumSubArray() {
        var nums = new int[] {5,4,-1,7,8};
        var my_result = MaximumSubArray.get(nums);

        // Derive your solution here and replace the hard coded result
        var your_result = 23;

        Assertions.assertEquals(your_result, my_result);
    }
}
