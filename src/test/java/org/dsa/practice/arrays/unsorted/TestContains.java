package org.dsa.practice.arrays.unsorted;

import org.dsa.learn.arrays.unsorted.Contains;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestContains {
    @Test
    public void testContainsDuplicates() {
        var nums = new int []{1,2,3,1};
        var my_result = Contains.duplicate(nums);

        // Derive your solution here and replace the hard coded result
        var your_result = true;

        Assertions.assertEquals(your_result, my_result);
    }
}
