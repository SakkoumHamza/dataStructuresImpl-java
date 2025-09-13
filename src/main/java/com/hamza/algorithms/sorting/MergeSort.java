package com.hamza.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int [] arr = {1,3,4,2,8,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int [] arr){
        if(arr == null || arr.length == 1){
            return;
        }

        int halfIndex = arr.length/2;
        int[] firstHalf = Arrays.copyOfRange(arr, 0, halfIndex);
        int[] secondHalf = Arrays.copyOfRange(arr, halfIndex, arr.length);
//        Recursive call to split each half of the array
        sort(firstHalf);
        sort(secondHalf);
        merge(arr, firstHalf, secondHalf);
    }
    private static void merge(int [] arr, int[] left, int[] right){
        int i = 0, j = 0, k = 0 ;
        while(i < left.length && j < right.length){
            if(left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
//        Copy the remaining elements
        while (i < left.length){
            arr[k++] = left[i++];
        }
        while (j < right.length){
            arr[k++] = right[j++];
        }
    }

}
