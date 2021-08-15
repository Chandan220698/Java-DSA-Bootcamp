import java.util.*;
public class TypeCasting {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int num = (int)23.41; // Typecasting: compressing bigger number into smaller type (Still both compatible just size different)
		System.out.println(num);
		
		int number = 'A';			//ASCII
		System.out.println(number);
		
		
		// (a * b) result will be of bigger primitive
		// (float * int)  int will get promoted to float then result will be float
		// (int / char) char will get promoted to int then result will be int
		
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.567f;
		double d = 0.1234;
		
		double result = (f * b) + (i / c) - (d * s);
		// float + int + double = double
		System.out.println((f * b) + " " + (i / c) +" "+ (d * s));
		System.out.println(result);
	}
}
