import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int[] arr = {-5, -12, -0, 0, 12, 1, 111, 369};
		bubbleSort(arr);
		
		System.out.println(Arrays.toString(arr));
		// Output: [-12, -5, 0, 0, 1, 12, 111, 369]
		
	}
	
	
	public static void bubbleSort(int[] arr) {
		// run the steps n-1 time
		boolean isSwapping;
		for(int i = 0;	i < arr.length;	i++) {
			// for each step, max item will come at the last respective index
			isSwapping = false;
			for(int j = 1;	j < arr.length - i;	j++) {
				if(arr[j-1] > arr[j])
				{
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					isSwapping = true;
				}
			}
			// if isSwapping is false means no swapping took place that so array is now already sorted and no future steps are required
			if(isSwapping = false) {
				break;
			}
		}
	}
	
}
