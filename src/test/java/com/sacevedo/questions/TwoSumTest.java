package com.sacevedo.questions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void shouldReturnIndicesForClassicExample() {
        List<Integer> result = TwoSum.twoSum(List.of(2, 7, 11, 15), 9);
        assertEquals(List.of(0, 1), result);
    }

    @Test
    void shouldHandleDuplicateValues() {
        List<Integer> result = TwoSum.twoSum(List.of(3, 3), 6);
        assertEquals(List.of(0, 1), result);
    }

    @Test
    void shouldReturnNullWhenNoSolutionExists() {
        List<Integer> result = TwoSum.twoSum(List.of(1, 2, 3), 99);
        assertNull(result);
    }

    @Test
    void shouldReturnNullForNullInput() {
        List<Integer> result = TwoSum.twoSum(null, 10);
        assertNull(result);
    }
}

