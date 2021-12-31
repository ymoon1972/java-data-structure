package com.datastucture.array;

/**
 * Base class for Sort operation.
 */
public class SortBase {
    /**
     * Checks whether the first item is smaller than the second item.
     * @param first First item to compare.
     * @param second Second item to be compared to.
     * @return true if the first item is smaller than the second item. false, otherwise.
     */
    public static boolean less(Comparable first, Comparable second) {
        return first.compareTo(second) < 0;
    }

    /**
     * Exchange the array item at specified two index.
     * @param arr array of items.
     * @param first First item index to be exchanged.
     * @param second Second item index to be exhanged.
     */
    public static void exch(Comparable[] arr, int first, int second) {
        Comparable t = arr[first];
        arr[first] = arr[second];
        arr[second] = t;
    }

    /**
     * Shows the item values of given object array.
     * @param arr Array of object to be displayed.
     */
    public static void show(Comparable[] arr) {
        for (Comparable item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    /**
     * Test whether the array entries are in order.
     * @param arr Array to be checked.
     * @return true if array entries are in order. false, otherwise.
     */
    public static boolean isSorted(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (less(arr[i], arr[i - 1]))
                return false;
        }

        return true;
    }
}
