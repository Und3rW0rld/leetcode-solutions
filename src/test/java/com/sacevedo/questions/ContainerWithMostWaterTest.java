package com.sacevedo.questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerWithMostWaterTest {

    @Test
    void shouldReturnFortyNineForClassicExample() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        assertEquals(49, ContainerWithMostWater.maxArea(height));
    }

    @Test
    void shouldReturnOneForTwoBars() {
        assertEquals(1, ContainerWithMostWater.maxArea(new int[]{1, 1}));
    }

    @Test
    void shouldReturnZeroForEmptyArray() {
        assertEquals(0, ContainerWithMostWater.maxArea(new int[]{}));
    }

    @Test
    void shouldHandleIncreasingHeights() {
        assertEquals(6, ContainerWithMostWater.maxArea(new int[]{1, 2, 3, 4, 5}));
    }
}

