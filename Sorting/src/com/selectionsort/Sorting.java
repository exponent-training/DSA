package com.insertion;

import java.util.Arrays;

public class Sorting {
	
	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5 };
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sort(int[] arr) {
		boolean swapped =  false;
		
		// steps
		for (int i = 0; i < arr.length; i++) {
			// swaping

			// initalially if j was = 0 then there would be no lement to be compared that is
			// why we have intialized it with j =1
			for (int j = 1; j < arr.length - i; j++) {
				// current index is compared with my previous elements
				if (arr[j] < arr[j - 1]) {
         
					int temp = arr[j] ;
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					
				}
			}
			
			if(swapped == false) {
				System.out.println("Not required to swap");break;
			}

		}
	}

}
