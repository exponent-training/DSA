package com;

import java.util.Arrays;

public class Arrays2dOutput {
	
	public static void main(String[] args) {
		
		int [][] arr = {
				{1,2,5,6},
				{4,5,6,7,8},
				{8,9,5,6},
		};
		
		
		System.out.println(arr.length);
		
		System.out.println(arr[1].length);
		
		
		
		for(int row = 0 ; row < arr.length ;row++) {
			System.out.print("[");
			for (int col = 0 ; col < arr[row].length;col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.print("]");
		}
		
		//System.out.println(Arrays.deepToString(arr));
		
		
//		for(int colarr[]:arr) {
//			System.out.print("[");
//			for(int elements:colarr) {
//				System.out.print(elements + " ");
//			}
//			
//			System.out.print("]");
//		}
//		
//	}

}
}
