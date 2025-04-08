package com.abstraction;

import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] arr, int st, int end) {
        int idx = st - 1;
        int pivot = arr[end];

        for (int j = st; j < end; j++) {
            if (arr[j] <= pivot) {
                idx++;
                // Swap arr[j] and arr[idx]
              
                
                swap(arr, idx, j);
            }
        }

        idx++;
        // Swap arr[end] and arr[idx]
       
        swap(arr, end, idx);
        return idx;
        
        
    }

    public static void quickSort(int[] arr, int st, int end) {
        if (st < end) {
            int pivIdx = partition(arr, st, end);

            quickSort(arr, st, pivIdx - 1); // left half
            quickSort(arr, pivIdx + 1, end); // right half
        }
    }
    
 
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort(arr, 0, arr.length - 1);
        
       System.out.println(Arrays.toString(arr));
    }
    
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
