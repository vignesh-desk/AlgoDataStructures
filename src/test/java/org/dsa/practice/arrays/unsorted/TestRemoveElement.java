package org.dsa.practice.arrays.unsorted;

import org.dsa.learn.arrays.unsorted.RemoveElements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRemoveElement {
    @Test
    public void testRemoveElement() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 3, 4, 3, 3, 2, 0, 1, 8};
        var my_result = RemoveElements.delete(arr, 3);

        // Derive your solution here and replace the hard coded result
        var your_result = 9;

        Assertions.assertEquals(your_result, my_result);
    }
}
