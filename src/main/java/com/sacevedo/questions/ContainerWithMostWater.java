package com.sacevedo.questions;

/*
* You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
* Find two lines that together with the x-axis form a container, such that the container contains the most water.
* Return the maximum amount of water a container can store.
*/


import static java.lang.Math.max;
import static java.lang.Math.min;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }

        int a = 0;
        int b = height.length - 1;
        int maxArea = 0;
        while (a != b ){

            maxArea = max(maxArea, (b-a)*min(height[a], height[b]));

            if(height[a] < height[b]){
                a++;
            }else{
                b--;
            }
        }
        return maxArea;
    }

    static void main() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        IO.println(maxArea(height));
    }
}
