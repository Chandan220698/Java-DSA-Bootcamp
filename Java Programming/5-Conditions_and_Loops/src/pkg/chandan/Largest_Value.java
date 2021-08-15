package pkg.chandan;
import java.util.*;
public class Largest_Value {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int max = a;
		
		if(b > max)
			max = b;
		else if(c > max)
			max = c;
		System.out.println(max);
		
		System.out.println("Using Math.max");
		int max2;
		
		max2 = Math.max(a, (Math.max(c, b)));
		System.out.println(max2);
		
	}
	
}
