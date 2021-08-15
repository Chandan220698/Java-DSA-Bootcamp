package pkg.chandan;

public class Count_Occurences {

	public static void main(String[] args) {
		// Occurence of 9 in given number
		
		int num = 3699639;
		int count = 0;
		
		while(num > 0) {
			int rem= num % 10;
			
			if(rem == 9)
				count++;
			
			num /= 10;
		}
		System.out.println(count);
	}

}
