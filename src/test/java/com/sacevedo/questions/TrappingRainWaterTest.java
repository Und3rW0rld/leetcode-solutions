package com.sacevedo.questions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrappingRainWaterTest {

    @Test
    void shouldReturnSixForClassicExample() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        assertEquals(6, TrappingRainWater.trap(height));
    }

    @Test
    void shouldReturnZeroForEmptyArray() {
        assertEquals(0, TrappingRainWater.trap(new int[]{}));
    }

    @Test
    void shouldReturnZeroForSingleBar() {
        assertEquals(0, TrappingRainWater.trap(new int[]{4}));
    }

    @Test
    void shouldReturnZeroForFlatHeights() {
        assertEquals(0, TrappingRainWater.trap(new int[]{2, 2, 2, 2}));
    }
}

