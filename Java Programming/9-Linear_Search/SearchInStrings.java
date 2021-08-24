import java.util.Arrays;

public class SearchInStrings {
	
	public static void main(String[] args) {
		
		String str = "Data Scientist";
		char target = 'S';
		
		System.out.println(search(str, target));
	}
	
	static boolean search(String str, char target) {
		
		if(str.length() == 0)
			return false;
		
//		for (int i = 0; i < str.length(); i++) {
//			if(target == str.charAt(i)) {
//				return true;
//			}
//		}
		System.out.println(Arrays.toString(str.toCharArray()));
		// Using for each loop
		for(char ch : str.toCharArray()) {
			if(ch == target)
				return true;
		}
		
		
		return false;
	}
}
