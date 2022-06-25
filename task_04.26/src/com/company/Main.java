package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5, 10, 7, 8, 3};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(array,1,3);
        System.out.println(Arrays.toString(array));
    }
}
