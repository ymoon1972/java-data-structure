package com.datastucture.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortBaseTest {
    @Test
    public void testLess() {
        assertTrue(SortBase.less(1, 2));
        assertFalse(SortBase.less(2, 1));
        assertFalse(SortBase.less(1, 1));
    }

    @Test
    public void testExch() {
        Integer[] arr = { 1, 2, 3, 4 };
        SortBase.exch(arr, 0, 2);
        assertEquals(3, arr[0]);
        assertEquals(1, arr[2]);
    }

    @Test
    public void testIsSorted() {
        Integer[] arr = { 1, 2, 3, 4 };
        assertTrue(SortBase.isSorted(arr));

        arr[1] = 5;
        assertFalse(SortBase.isSorted(arr));
    }
}