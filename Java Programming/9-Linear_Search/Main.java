import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		int[] nums = {1, 3, 52, 9, 369, -23, 0, 111};
		int ans = linearSearch(nums, 369);
		System.out.println(ans);		// Print 4(index)
		
	}
	
	// Search in array: if found return index else return -1
	static int linearSearch(int[] arr, int target) {
		
		if(arr.length == 0)
			return -1;
		
		for(int index = 0;	index < arr.length;	index++) {
			if(arr[index] == target)
				return index;
		}
		return -1;		
	}
	
}
