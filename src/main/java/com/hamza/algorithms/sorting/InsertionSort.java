package com.hamza.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main (String[] args) {
        int [] array = {2,3,1,5,3,2} ;
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j>=0 && array[j]> current) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }

    }
}
