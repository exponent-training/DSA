package com.arrays1d;

public class SearchInRange {
	
	

	
	public static void main(String[] args) {
		//search for 3 in range of index 1 to 4
		

		
		boolean search = Search(1, 4, new int[]{18,12,-7,3,14,28},89);
		
		if(search) {
			System.out.println("Value found");
		}else {
			System.out.println("Value doesn't exits");
		}
		
		
		
		
	}
	
	
	static boolean Search(int start,int end,int[] arr,int target) {
		
		for(int i = start ; i <= end ;i++) {
			if(arr[i] == target) {
				return true;
			}
		}
		return false;
	}

}
