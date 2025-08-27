package org.dsa.learn.arrays.unsorted;

public class BestTimeToByStock {
    public static int findMaxProfit(int[] prices) {
        if (prices == null || prices.length == 0) { return 0; }
        int maxProfit = 0; int minValue = prices[0];

        for (Integer price : prices) {
            if (price < minValue)
                minValue = price;
            else {
                var profit = price - minValue;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return  maxProfit;
    }
}
