import java.util.Arrays;

public class Passing_function {

	public static void main(String[] args) {

		int[] nums = {3, 4, 5, 22};
		System.out.println(Arrays.toString(nums));
		Change(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	static void Change(int[] arr) {
		arr[0] = 99;					// Arrays are mutable whereas strings are immutable
										// Mutable means orignal object(nums) will also change
	}
}
