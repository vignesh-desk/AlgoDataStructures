package org.dsa.practice.arrays.unsorted;

import org.dsa.learn.arrays.unsorted.ProductExceptSelf;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProductExceptSelf {
    @Test
    public void testProductExceptSelf() {
        int[] nums = new int[]{1,2,3,1};
        var my_result = ProductExceptSelf.get(nums);

        // Derive your solution here and replace the hard coded result
        var your_result = new int[]{6,3,2,6 };

        Assertions.assertArrayEquals(your_result, my_result);
    }
}
