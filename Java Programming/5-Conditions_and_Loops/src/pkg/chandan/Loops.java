package pkg.chandan;

public class Loops {
	public static void main(String[] args) {
		
		// For Loops
		System.out.println("---- For Loops ----");
		for(int num = 1;	num <= 5;	num++) {
			System.out.println(num);
		}
		
		// While Loops
		System.out.println("---- While Loops ----");
		int i = 1;
		while (i < 10) {
			System.out.print(i + " ");
			i++;
		}
		
		// Do While Loop
		System.out.println("\n---- Do while Loops ----");
		i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i <= 5);	
		
		
	}
}
