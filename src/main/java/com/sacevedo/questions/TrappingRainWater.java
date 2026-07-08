package com.sacevedo.questions;

import java.util.Arrays;

/* Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.*/

public class TrappingRainWater {
    public static int trap(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }

        int total = 0;
        int maxLeft = height[0];
        int indexLeft = 0;
        int indexRight = height.length - 1;
        int maxRight = height[indexRight];

        while (indexRight != indexLeft){
            if (maxLeft <= maxRight) {
                indexLeft++;
                total += Math.max(maxLeft - height[indexLeft], 0);
                maxLeft = Math.max(maxLeft, height[indexLeft]);
            }else {
                indexRight--;
                total += Math.max(maxRight - height[indexRight], 0);
                maxRight = Math.max(maxRight, height[indexRight]);
            }
        }

        return total;
    }

    static void main(String[] args) {
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        IO.println(Arrays.toString(height));
        IO.println("total: " + trap(height));
    }
}
