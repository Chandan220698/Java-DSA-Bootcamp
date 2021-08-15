package pkg.chandan;
import java.util.*;
public class case_check {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String word = "     Hello ";
		System.out.println(word);
		System.out.println(word.trim());
		System.out.println(word.charAt(0)); 		// Printing space at index 0.
		System.out.println(word.trim().charAt(0));
		
		System.out.print("Input a Character: ");
		char ch = in.next().trim().charAt(0);
		if(ch >= 'a' && ch <= 'z')
			System.out.println("Lower Case");
		else
			System.out.println("Upper Case");
		
	}

}
