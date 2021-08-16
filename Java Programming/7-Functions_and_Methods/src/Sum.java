import java.util.Scanner;

public class Sum {
	public static void main(String[] args)
	{
		sum();
		int ans = sum3(20, 32);
		System.out.println("(Using sum3)The sum = " + ans);
	}
	
	static void sum() //No returning parameter
	{
		Scanner in = new Scanner(System.in);
		int num1, num2, sum;
		System.out.print("Enter num1: ");
		num1 = in.nextInt();
		System.out.print("Enter num2: ");
		num2 = in.nextInt();
		
		sum = num1+ num2;
		
		System.out.println("(Using sum)The sum = " + sum);
	}
	static int sum3(int a, int b) // With argument and returning parameters
	{
		int sum = a + b;
		return sum;
	}

}
