package com.hamza.algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int [] unsortedArray = {5, 4, 3, 2, 1};
        selectionSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }


    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            var minIndex = findMinIndex(array, i);
            swap(array, i, minIndex);
        }
    }
    private static void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }
    private static int findMinIndex(int[] array,int i){
        int minIndex = i;
        for (int j = i ; j < array.length; j++) {
            if (array[j] < array[minIndex] ) {
                minIndex = j;
            }
        }
        return minIndex;
    }
}
