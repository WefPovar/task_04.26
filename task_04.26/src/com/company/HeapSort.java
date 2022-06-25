package com.company;

import java.util.Arrays;

/**
 * Пирамидальная сортировка (HeapSort) (в качестве примера)
 */

public class HeapSort {
    private static void siftDown(int[] data, int k, int n) {
        int value = data[k];
        while (true) {
            int childIndex = 2 * k + 1;
            if (childIndex >= n) {
                break;
            }
            if (childIndex + 1 < n && data[childIndex + 1] > data[childIndex]) {
                childIndex++;
            }
            if (value > data[childIndex]) {
                break;
            }
            data[k] = data[childIndex];
            k = childIndex;
        }
        data[k] = value;
    }

    public static <T extends Comparable<T>> void sort(int[] array, int from, int to) {
        int[] sortableValues = new int[to-from];
        System.arraycopy(array,from,sortableValues,0,sortableValues.length);
        int heapSize = sortableValues.length;
        for (int i = heapSize / 2; i >= 0; i--) {
            siftDown(sortableValues, i, heapSize);
        }

        while (heapSize > 1) {
            int tmp = sortableValues[heapSize - 1];
            sortableValues[heapSize - 1] = sortableValues[0];
            sortableValues[0] = tmp;
            heapSize--;
            siftDown(sortableValues, 0, heapSize);
        }
        System.arraycopy(sortableValues,0,array,from,to);
    }
}