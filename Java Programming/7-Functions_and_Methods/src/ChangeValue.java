import java.util.Arrays;

public class ChangeValue
{
	public static void main(String[] args)
	{
		int[] arr = {1, 3, 2, 45, 6};
		change(arr);
		System.out.println(Arrays.toString(arr));
	}
	//It is not passed by value like normal primitives
	//It is passed by the copy of the value of reference
	//Hence original arr will change
	//We are modifying the arr
	static void change(int[] nums)
	{
		nums[0] = 99;
	}
}
