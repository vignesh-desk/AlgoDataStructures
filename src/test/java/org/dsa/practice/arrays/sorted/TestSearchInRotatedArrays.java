package org.dsa.practice.arrays.sorted;

import org.dsa.learn.arrays.sorted.SearchInRotatedArrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSearchInRotatedArrays {
    @Test
    public void testSearchInRotatedArrays() {
        var nums = new int[]{4,5,6,7,0,1,2}; var target = 0;
        var my_result = SearchInRotatedArrays.search(nums, target);

        // Derive your solution here and replace the hard coded result
        var your_result = 4;
        Assertions.assertEquals(your_result, my_result);
    }
}
