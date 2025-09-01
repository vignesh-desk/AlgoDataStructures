package org.dsa.practice.arrays.unsorted;

import org.dsa.learn.arrays.unsorted.TrappingRainWater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTrappingRainWater {
    @Test
    public void testTrappingRainWater() {
        int[] heights = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        var my_result = TrappingRainWater.get(heights);

        // Derive your solution here and replace the hard coded result
        var your_result = 6;
        Assertions.assertEquals(your_result, my_result);
    }
}
