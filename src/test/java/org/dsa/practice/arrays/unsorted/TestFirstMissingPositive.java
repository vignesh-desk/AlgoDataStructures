package org.dsa.practice.arrays.unsorted;

import org.dsa.learn.arrays.unsorted.FirstMissingPositive;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFirstMissingPositive {
    @Test
    public void testFirstMissingPositive() {
        var nums = new int[]{7,8,9,11,12};

        var my_result = FirstMissingPositive.get(nums);

        // Derive your solution here and replace the hard coded result
        var your_result = 1;

        Assertions.assertEquals(your_result, my_result);
    }
}
