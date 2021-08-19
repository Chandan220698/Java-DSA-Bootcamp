import java.util.*;
public class MultiDimension {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		// int[][] arr = new int[3][3];			// Defining no. of rows are mandatory 
											// Defining no. of column are not mandatory
		
		int[][] arr1 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int[][] arr2 = {
				{1, 2, 3},		// 0th index
				{4, 5},			// 1st index
				{6, 7, 8, 9}	// 2nd index
		};
		
		System.out.println("arr2.length = " + arr2.length);				// Number of rows
		System.out.println("Length of index 2 row = " + arr2[2].length);	// Number of column in row index 2
		
		System.out.println("\nOutput of 2D Array arr2");
		for(int row = 0;	row < arr2.length;	row++) {
			for(int col = 0;	col < arr2[row].length;	col++) {
				System.out.print(arr2[row][col] + " ");
			}
			System.out.println();
		}
		
		
		// Input
		System.out.println("\nEnter elements of 2D Array");
		for(int row = 0;	row < arr.length;	row++) {
			for(int col = 0;	col < arr[row].length;	col++) {
				arr[row][col] = in.nextInt();
			}
		}
		
		// Display
		System.out.println("\nOutput of 2D Array");
		for(int row = 0;	row < arr.length;	row++) {
			for(int col = 0;	col < arr[row].length;	col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println("\nOut of 2D Array (using Arrays.toString method)");
		for(int row = 0;	row < arr.length;	row++)
			System.out.println(Arrays.toString(arr[row]));
		
		System.out.println("\nOut of 2D Array (using Enhanced for loop)");
		for(int[] element : arr)							// Now here each "element" actually is row of matrix
			System.out.println(Arrays.toString(element));
	}

}
