
public class Main
{
	public static void main(String[] args)
	{
		// Syntax
		// datatype[] variable_name = new datatype[size];
		
		int[] ros;			// At compile time 
							// Declaration of array. ros is getting defined in the stack.
							
		ros = new int[5];	// At run time hence dynamic memory allocation
							// New is used to create an object
							// Initialisation, Actually here object is being created in memory (heap memory).
							// [0, 0, 0, 0, 0]
		
		System.out.println(ros[1]); 	// Print 0.
		
		String[] arr = new String[5];
		System.out.println(arr[0]); 	// Null
		
		
	}

}
