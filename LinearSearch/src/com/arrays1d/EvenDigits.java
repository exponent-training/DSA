package com.arrays1d;

public class EvenDigits {
	public static void main(String[] args) {
		
		int[] arr =  {10,50,789,654,1001,5489};
		
		
		
		System.out.println(search(arr));
	}

	  
	static int search(int [] arr) {
		 int count = 0;
		 for(int elements:arr) {
			if(isEven(elements) == true) {
				count++;
			}
			 
		 }
		 return count;
	 }

	 
	static boolean isEven(int number) {
		 //1001
		 int sum =0;
		 while(number > 0) {
			 int rem  = number % 10; // 1
			 sum = sum + rem;  // sum = 0 rem = 1 --> sum + rem = 0
			 
			 number /= 10;
			 
		 }
		 
		 if(sum % 2 ==0) {
			 return true;
		 }else {
			 return false;
		 }
	 }



}
