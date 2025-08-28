package org.dsa.practice.arrays.unsorted;

import org.dsa.learn.arrays.unsorted.ThreeSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestThreeSum {
    @Test
    public void testThreeSum() {
        var nums = new int[]{-1,0,1,2,-1,-4};
        var my_result = ThreeSum.get(nums);

        // Derive your solution here and replace the hard coded result
        var your_result = new ArrayList<>(
                Arrays.asList(
                        Arrays.asList(-1, -1, 2),
                        Arrays.asList(-1, 0, 1)
                )
        );

        Assertions.assertEquals(your_result, my_result);
    }
}
