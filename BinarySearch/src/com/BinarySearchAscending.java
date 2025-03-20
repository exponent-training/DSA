package com;

public class BinarySearchAscending {
    
//	start <= end
	// Yeh loop tab tak chalta hai jab tak start pointer, end pointer se chhota ya
	// equal hai. Agar start pointer end pointer se bada ho jata hai, toh iska
	// matlab hai ki target value array mein nahi hai.

	public static void main(String[] args) {
		System.out.println(binarySearch(new int[] { -18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45 }, 22));

	}

	// return index if found else return -1   //for ascending
	static int binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) { // yeh loop tab tak execute karna hai jab tak mera start index end e=index se
				// bada na ho ya phir mera start and end index equal na ho

			int mid = start + (end - start) / 2;

			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

}
