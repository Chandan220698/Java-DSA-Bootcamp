package pkg.chandan;

import java.util.*;
public class Fibo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int prv = 0;
		int curr = 1;
		
		int itr = 2;
		
		while(itr <= n) {
			int temp = curr;
			curr = curr + prv;
			prv = temp;
			itr++;
		}
		
		System.out.println("The " + n + "th term of Fibonacci Series is: "+ curr);
	}

}
