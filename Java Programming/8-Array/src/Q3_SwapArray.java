import java.util.Arrays;

public class Q3_SwapArray {

	public static void main(String[] args) {

		int arr[] = {1, 3, 0, -23, 369};
		System.out.println("Before Reverse: ");
		System.out.println(Arrays.toString(arr));
		
		reverseArray(arr);
		System.out.println("\nAfter Reverse: ");
		System.out.println(Arrays.toString(arr));
	}

	static void reverseArray(int[] arr) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start < end)
		{
			swap(arr, start, end);
			start++;
			end--;
		}
		
	}
	
	static void swap(int[] arr, int index_a, int index_b) {
		int temp = arr[index_a];
		arr[index_a] = arr[index_b];
		arr[index_b] = temp;
	}
	
}
