

import java.util.Arrays;

public class Q1_SwappingElements {

	public static void main(String[] args) {
		
		int arr[] = {111, 369, 1010, 777, 101};
		
		System.out.println("Before Swap");
		System.out.println(Arrays.toString(arr));
		
		// Swapping elements at index 1 & 3 
		swap(arr, 1, 3);
		
		System.out.println("Before Swap");
		System.out.println(Arrays.toString(arr));
	}
	
	static void swap(int[] arr, int index1, int index2) {
		
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		
	}

}
