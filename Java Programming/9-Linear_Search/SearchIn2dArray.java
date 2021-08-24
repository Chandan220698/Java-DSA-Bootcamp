import java.util.Arrays;

public class SearchIn2dArray {

	public static void main(String[] args) {

		int[][] arr = {
				{1, 32},
				{0, 19, -23, 4},
				{3, 23, 0, -23},
				{369, 111}
		};
		
		int target = 23;
		int[] returnArr = search(arr, target);		// format of return value (row index, col index)
		int max = search_maxValue(arr);
		System.out.println(Arrays.toString(returnArr));
		System.out.println("Max Value in 2D Array: " + max + ", At index: " + Arrays.toString(search(arr, max)));
	}

	static int[] search(int[][] arr, int target) {
		
		for (int row = 0; row < arr.length; row++) {
			for(int col = 0;	col < arr[row].length;	col++) {
				if(arr[row][col] == target)
					return new int[] {row, col};				// creating object of int[] (returning array) and assigning value
			}
		}
		return new int[] {-1, -1};
	}
	
	static int search_maxValue(int[][] arr) {
		
		int max = Integer.MIN_VALUE;		//MIN_VALUE is minimum value in integer can hold java
		
		for(int[] ar : arr) {
			for(int element : ar) {
				if(element > max) {
					max = element;
				}
			}
		}
		
		return max;
	}
	
}
