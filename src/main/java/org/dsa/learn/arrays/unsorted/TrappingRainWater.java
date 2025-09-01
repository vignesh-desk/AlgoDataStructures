package org.dsa.learn.arrays.unsorted;

/*
  Trapping Rain Water

  Given n non-negative integers representing an elevation map where the width of each bar is 1,
  compute how much water it can trap after raining.

  Example:
    Input:  height = [0,1,0,2,1,0,1,3,2,1,2,1]
    Output: 6

  Explanation:
    The elevation map forms "valleys" where water can be trapped.
    At index 2, 1 unit of water is trapped.
    At index 5, 2 units of water are trapped.
    At index 6, 1 unit of water is trapped.
    At index 9, 1 unit of water is trapped.
    At index 10, 1 unit of water is trapped.
    Total trapped water = 6.
*/

public class TrappingRainWater {
    public static int get(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        int[] left_max = new int[heights.length]; left_max[0] = heights[0];
        int[] right_max = new int[heights.length]; right_max[heights.length - 1] =  heights[heights.length - 1];
        int units = 0;
        for (int i = 1; i < heights.length; i++) {
            left_max[i] = Math.max(left_max[i-1], heights[i]);
        }

        for (int j = heights.length-2; j >= 0; j--) {
            right_max[j] = Math.max(right_max[j+1], heights[j]);
        }

        for (int k=0; k < heights.length; k++) {
            units += Math.min(left_max[k], right_max[k]) - heights[k];

        }

        return units;
    }
}
