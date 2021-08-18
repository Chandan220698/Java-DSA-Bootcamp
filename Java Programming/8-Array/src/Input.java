import java.util.*;
public class Input
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("Enter 5 elements:");
		for(int i = 0;	i < arr.length;	i++) {
			arr[i] = in.nextInt();
		}
		for(int i = 0;	i < arr.length;	i++)
			System.out.print(arr[i] + " ");
		
		
		// Enhanced for loop (For each loop)
		System.out.println("\nUsing Enhanced For Loop (For each loop)");
		for(int num: arr) {					// For every element in array, print the element 
			System.out.print(num + " ");	// Here num represents element of the array
		}
		
		
		// Using Arrays.toString(arr_name)
		System.out.println("\nUsing Arrays.toString (Arrays class, toString method)");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("String array: Enter 4 elements");
		String[] str = new String[4];
		
		for(int i = 0;	i < str.length;	i++) {
			str[i] = in.next();
		}
		for(String element: str) {
			System.out.println(element);
		}
		System.out.println(Arrays.toString(str));
	}
}
