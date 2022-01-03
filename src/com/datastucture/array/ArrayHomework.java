package com.datastucture.array;

public class ArrayHomework {
    /**
     * Rotate array items to the left with given index amount.
     * @param arr Array to be rotated.
     * @param d Number of index to be rotated.
     */
    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        d = (d % n);
        int numLoops = gcd(n, d);

        for (int i=0; i<numLoops; i++) {
            int j = i;
            int t = arr[j];

            while (true) {
                int next = j + d;
                if (next >= n)
                    next -= n;
                if (next == i)
                    break;

                arr[j] = arr[next];
                j = next;
            }

            arr[j] = t;
        }
    }

    /**
     * Update every element with multiplication of previous and next elements with following exceptions.
     *  a) First element is replaced by multiplication of first and second.
     *  b) Last element is replaced by multiplication of last and second last
     * @param arr array to be modified.
     */
    public static void multPrevNext(int[] arr) {
        int prev = arr[0], cur;

        arr[0] = arr[0] * arr[1];
        for (int i=1; i<arr.length - 1; i++) {
            cur = arr[i];
            arr[i] = prev * arr[i+1];
            prev = cur;
        }

        arr[arr.length - 1] *= prev;
    }

    /**
     * Find second-largest element in a given array.
     * @param arr Array to be checked.
     * @return Second largest element value. -1, if not exists.
     */
    public static int findSecondLargest(int[] arr) {
        int first = arr[0], second = Integer.MIN_VALUE;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] != first && arr[i] > second) {
                second = arr[i];
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    private static int gcd(int a, int b) {
        if (b > a)
            return gcd(b, a);

        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }

        return a;
    }
}
