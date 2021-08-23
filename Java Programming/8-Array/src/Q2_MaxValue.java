import java.util.*;
public class Q2_MaxValue {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 75, -42, 0, 369};
		System.out.println(max(arr));
		
	}
	
		static int max(int[] arr) {
			int max_val = arr[0];
					
			for(int i = 1;	i < arr.length;	i++) {
				if(arr[i] > max_val) {
					max_val = arr[i];
				}
			}
			
			return max_val;
		}
	
}
