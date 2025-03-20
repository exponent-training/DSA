package com;

/*
 * compare  the  first and  the  last  element (if first element in the index  > last index element) --> than ascending else descending
 * 
 * */

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		
//		System.out.println(binarySearch(new int[] { 99, 80, 75, 22, 11, 10, 5, 2, -3 }, 22)); //descending
		
//		System.out.println(binarySearch(new int[] { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45 }, 101));  //ascending
		
	System.out.println(binarySearch(new int[]{5,5,5,5,5},5)); //if my index is similar

	}

	private static int binarySearch(int[] arr, int target) {

		int start = 0;

		int end = arr.length - 1;
		
		
		// Check if first and last elements are the same  
	    if (arr[start] == arr[end]) {
	        if (target == arr[start]) {
	            return start; // Return any index (e.g., first index)
	        } else {
	            return -1; // Target not found
	        }
	    }

		boolean isAsc = arr[start] < arr[end];

//		System.out.println(isAsc);

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (isAsc) {
				
				//for ascending
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
				
				//for descending
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return -1;

	}

}
