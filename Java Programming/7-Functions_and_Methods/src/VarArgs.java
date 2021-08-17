import java.util.Arrays;

//Variable length argument
public class VarArgs
{
	public static void main(String[] args)
	{
		fun(2, 3, 4, 512, 23, 42,551, 3, 6, 9);
		multiple(2, 4, "Thor", "Iron-Man", "Spiderman");	//No error
		//multiple(2, "Thor", "Iron-Man", "Spiderman");		//Give error, the order of arguments must be same
		//multiple(int a, String ...v, int b)				//VarArgs always at the end 
	}
	//we dont know the number of inputs/arguments
	//zero or more arguments
	static void fun(int ...v)
	{
		System.out.println(Arrays.toString(v));
	}
	static void multiple(int a, int b, String ...v)
	{
		
	}
}
