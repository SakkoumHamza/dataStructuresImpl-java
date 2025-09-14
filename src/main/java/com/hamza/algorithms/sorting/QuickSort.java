package com.hamza.algorithms.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void  main(String[] args){
        int [] arr = {10,2,3,4,1,6,7,1,3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr){
        sort(arr,0,arr.length-1);
    }
    private static void sort(int[] arr, int start, int end) {
        if ( start >= end )
            return;

        var boundary = partition(arr, start, end);
        sort( arr , start , boundary-1 );
        sort( arr , boundary+1 , end );
    }

    private static int partition(int[] arr,int start,int end) {
        var pivot = arr[end];
        var boundary = start - 1;

        for ( int i = start ; i <= end ; i++ )
            if(arr[i] <= pivot)
                swap(arr, i, ++boundary);

        return boundary;
    }

    private static void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

}
