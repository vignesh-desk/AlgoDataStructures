package org.dsa.practice.arrays.unsorted;

import org.dsa.learn.arrays.unsorted.MaximumSubArrayProduct;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMaximumSubArrayProduct {
    @Test
    public void testMaximumSubArrayProduct() {
        var nums = new int[]{-2, 1, -3, 0, -1, 2, 1, -5, 4, 0, 9};
        var my_result = MaximumSubArrayProduct.get(nums);

        // Derive your solution here and replace the hard coded result
        var your_result = 40;
        Assertions.assertEquals(your_result, my_result);
    }
}
