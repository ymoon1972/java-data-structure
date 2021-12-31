package com.datastucture.array;

import lombok.Getter;

/**
 * Sample class to encapsulate an array data.
 */
public class Array {
    protected static int DEFAULT_ARRAY_LENGTH = 256;

    private int[] data;
    private int dataLength;

    /**
     * Get the length of array data.
     */
    @Getter
    private int length;

    /**
     * Create an array with default length.
     */
    public Array() {
        this(DEFAULT_ARRAY_LENGTH);
    }

    /**
     * Create an array with given length.
     * @param length
     */
    public Array(int length) {
        this.length = length;
        this.dataLength = Math.max(length, DEFAULT_ARRAY_LENGTH);
        this.data = new int[this.dataLength];
    }

    /**
     * Get a value at specified index.
     * @param index index to get value.
     * @return Stored value at specified index.
     */
    public int getAt(int index) {
        checkIndex(index);
        return this.data[index];
    }

    /**
     * Set a value at specified index.
     * @param index index to set value.
     * @param value value to be stored.
     */
    public void setAt(int index, int value) {
        checkIndex(index);
        this.data[index] = value;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= this.length)
            throw new ArrayIndexOutOfBoundsException();
    }
}
