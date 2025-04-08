package com.cyclicsort;

import java.util.Arrays;

public class CyclicSort {
	public static void main(String[] args) {

		int[] arr = {5,4,3,2,1};

		sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}


	private static void sort(int[] arr) {
		// represent counter if my current index element is in proper index(position) than
		// increase this i
		int i = 0; 
		
		while(i < arr.length) {
			int correctIndex = arr[i] -1 ;
			if(arr[i] != arr[correctIndex]) {
				swap(arr,i,correctIndex);
			}else {
				i++;
			}
		}

	}

	private static void swap(int[] arr, int first, int second) {
		int temp = arr[first] ;
		arr[first] = arr[second];
		arr[second] = temp;
		
	}

}
