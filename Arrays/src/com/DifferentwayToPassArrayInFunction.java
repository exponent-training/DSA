package com;

import java.util.Arrays;

public class DifferentwayToPassArrayInFunction {
	
	public static void main(String[] args) {
		m1(new int[]{10,20,30});
		
	}
	
	static void m1(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
