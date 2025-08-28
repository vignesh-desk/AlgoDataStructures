package org.dsa.learn.arrays.unsorted;

/*
 Problem: Container With Most Water

 You are given an integer array height of length n.
 There are n vertical lines drawn such that the two endpoints of the i-th line
 are (i, 0) and (i, height[i]).

 Find two lines that together with the x-axis form a container, such that the
 container contains the most water.

 Return the maximum amount of water a container can store.

 Constraints:
 - n >= 2
 - 1 <= height[i] <= 10^4
*/

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        if (height == null || height.length == 0) { return 0; }
        int max = 0; int left = 0; int right = height.length - 1;
        while(left < right) {
            int width = right -left;
            int length = Math.min(height[left], height[right]);
            max = Math.max(max, length * width);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}
