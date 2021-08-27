package com.chandan;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};	// Sorted Array
		int target = 22;
		int ans = binarySearch(arr, target);
		System.out.println(ans);		// Printing index 10 for target element 22
		
	}

	// Return index of searched element
	// Return -1 if element doesnt exist
	
	static int binarySearch(int[] arr, int target){
		// size of (start + end) might exceed the range of int
		// use start + ((end-start)/2)
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end)
		{
			int mid = start + ((end - start)/2);
			
			if(target < arr[mid]) {
				end = mid - 1;
			}else if(target > arr[mid]) {
				start = mid + 1;
			}else {
				return mid;		// Element found
			}
			
		}
		return -1;				// Element Not Found
	}
	
}
