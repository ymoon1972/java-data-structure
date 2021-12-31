package com.datastucture.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest {
    @Test
    public void arrayHappyPath() {
        Array array = new Array();
        assertEquals(Array.DEFAULT_ARRAY_LENGTH, array.getLength());

        array.setAt(5, 100);
        assertEquals(100, array.getAt(5));
    }

    @Test
    public void arrayIndexOutOfBoundsException() {
        Array array = new Array(5);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.getAt(-1));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> array.setAt(10, 10));
    }

}