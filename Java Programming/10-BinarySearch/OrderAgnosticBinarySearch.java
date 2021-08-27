package com.chandan;
// Order Agnostic Binary Search: when we dont know weather array is asc or dec order

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		
		//int[] arr  = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};	// Print Sorted Array 
		int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
		int target = 22; 
		int ans = orderAgnostic_BinarySearch(arr, target);
		System.out.println(ans);											// Print index 10 for 22 (Asc Array)
																			// Print index 3 for 22 (Dsc Array)
		
	}

	static int orderAgnostic_BinarySearch(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length - 1;
		
		boolean isAsc = arr[start] < arr[end];
		
		while(start <= end) {
			
			int mid = start + ((end - start)/2);
			
			if(target == arr[mid]) {
				return mid;
			}
			
			if(isAsc == true) {
				if(target < arr[mid]) {
					end = mid - 1;
				}else {
					start = mid + 1;
				}
			}else {
				if(target < arr[mid]) {
					start = mid + 1;
				}else {
					end = mid - 1;
				}
			}
			
		}
		return -1;
	}
}
