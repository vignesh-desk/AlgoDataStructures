package org.dsa.practice.arrays.unsorted;

import org.dsa.learn.arrays.unsorted.BestTimeToByStock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBestTimeToByStock {
    @Test
    public void testBestTimeToBuyStock_Unsorted() {
        var prices = new int[]{7,1,5,3,6,4};
        var my_result = BestTimeToByStock.findMaxProfit(prices);

        // Derive your solution here and replace the hard coded result
        var your_result = 5;

        Assertions.assertEquals(your_result, my_result);
    }
}
