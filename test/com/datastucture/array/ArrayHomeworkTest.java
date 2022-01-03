package com.datastucture.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayHomeworkTest {
    @Test
    public void rotate() {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] expected = { 3, 4, 5, 6, 1, 2 };

        ArrayHomework.rotate(arr, 2);
        assertTrue(Arrays.equals(expected, arr));

        ArrayHomework.rotate(arr, 4);
        int[] expected2 = { 1, 2, 3, 4, 5, 6 };
        assertTrue(Arrays.equals(expected2, arr));

        ArrayHomework.rotate(arr, 8);
        assertTrue(Arrays.equals(expected, arr));
    }

    @Test
    public void multiPrevNext() {
        int[] arr = { 2, 3, 4, 5, 6 };
        int[] expected = { 6, 8, 15, 24, 30 };

        ArrayHomework.multPrevNext(arr);
        assertTrue(Arrays.equals(expected, arr));
    }

    @Test
    public void secondLargestElement() {
        int[] arr  = { 12, 35, 1, 10, 34, 1 };
        assertEquals(34, ArrayHomework.findSecondLargest(arr));

        int[] arr2 = { 10, 5, 10 };
        assertEquals(5, ArrayHomework.findSecondLargest(arr2));

        int[] arr3 = { 10, 10, 10 };
        assertEquals(-1, ArrayHomework.findSecondLargest(arr3));
    }
}