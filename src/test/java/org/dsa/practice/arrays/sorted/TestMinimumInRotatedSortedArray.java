package org.dsa.practice.arrays.sorted;

import org.dsa.learn.arrays.sorted.MinimumInRotatedSortedArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMinimumInRotatedSortedArray {
    @Test
    public void testMinimumInRotatedSortedArray() {
        var nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        var my_result = MinimumInRotatedSortedArray.get(nums);

        // Derive your solution here and replace the hard coded result
        var your_result = 0;

        Assertions.assertEquals(your_result, my_result);
    }
}
