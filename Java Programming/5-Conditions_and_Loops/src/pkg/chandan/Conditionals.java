package pkg.chandan;

public class Conditionals {

	public static void main(String[] args) {
		
		int salary = 10000;
		
		if(salary > 20000) {
			salary += 2000;
		}else if(salary > 10000) {
			salary += 1000;
		}else {
			salary = salary + 500;
		}
		
		System.out.println("New Salary: "+ salary);
	}

}
