package org.dsa.practice.arrays.unsorted;

import org.dsa.learn.arrays.unsorted.ContainerWithMostWater;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestContainerWithMostWater {
    @Test
    public void testTestContainerWithMostWater() {
        var height = new int[]{1,8,6,2,5,4,8,3,7};
        var my_result = ContainerWithMostWater.maxArea(height);

        // Derive your solution here and replace the hard coded result
        var your_result = 49;
        Assertions.assertEquals(your_result, my_result);
    }
}
