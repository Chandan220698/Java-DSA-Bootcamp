import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {-5, -12, -0, 0, 12, 1, 111, 369};
		
		selectionSort(arr);
		
		System.out.println(Arrays.toString(arr));
		// Output: [-12, -5, 0, 0, 1, 12, 111, 369]
		
	}
	
	public static void selectionSort(int[] arr) {
		
		for(int i = 0;	i < arr.length;	i++) {
			
			int last = arr.length-i-1;
			int maxIndex = 0;
			
			for(int j = 0;	j < arr.length-i;	j++) {
				if(arr[maxIndex] < arr[j]) {
					maxIndex = j;
				}
			}
			
			// Swap maxIndex with lastIndex available(arr.length-i-1)
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
			
		}
		
	}
	
}
