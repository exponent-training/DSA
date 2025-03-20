package com;

public class BinarySearchDescending {
	
	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] { 99, 80, 75, 22, 11, 10, 5, 2, -3 }, 22));

	}

// return index if found else return -1   //for ascending
static int binarySearch(int[] arr, int target) {

	int start = 0;
	int end = arr.length - 1;

	while (start <= end) {

		int mid = start + (end - start) / 2;

		if (target > arr[mid]) {
			end = mid - 1;
		} else if (target < arr[mid]) {
			start = mid + 1;
		} else {
			return mid;
		}
	}

	return -1;
}


}
