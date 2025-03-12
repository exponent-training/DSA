package com;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2dInput {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of  row:");
		int rowNum = sc.nextInt();
		
		System.out.println("Enter number of  col:");
		int colNum = sc.nextInt();
		int [][] arr = new  int [rowNum][colNum];
		
	
		
		for(int row = 0 ; row < arr.length ;row++) {
	
		for (int col = 0 ; col < arr[row].length;col++) {
			arr[row][col] = sc.nextInt();
		}
	
	}
		
		System.out.println(Arrays.deepToString(arr));
	}

	
//	for(int col[]:arr) {
//		for (int elemnts:col) {
//			elemnts = sc.nextInt();
//		}
//	}
//	
//	System.out.println(Arrays.deepToString(arr));
//	}
}
