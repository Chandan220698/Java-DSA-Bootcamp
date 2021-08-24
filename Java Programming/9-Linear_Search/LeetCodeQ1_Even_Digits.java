

// Find count of no of even_digits number in an array
// {2, 12, 22, 1112, 252} - ans: 3

public class LeetCodeQ1_Even_Digits {

	public static void main(String[] args) {
			
		int[] arr = {2, 12, 22, 1112, 252, 11, 00, -11, -4};
		int ans = findNumbers(arr);
		System.out.println(ans);
		
	}
	
	static int findNumbers(int[] nums) {
		int count = 0;
		
		for(int num : nums) {
			if(isEvenDigit(num))
				count++;
		}
		
		return count;
	}
	// Function to check if number is even digits number or not
	static boolean isEvenDigit(int num) {
		int digit_count = 0;
		// For numbers zero or less then zero
		if(num == 0)
			return false;
		else if(num < 0)
			num = num * -1;
		
		while(num > 0) 			// (int)(math.log10(num)) + 1;
		{
			num/=10;
			digit_count++;
		}
//		if(digit_count%2==0)
//			return true;
//		else
//			return false;
		return digit_count%2 == 0;
	}
	
}
