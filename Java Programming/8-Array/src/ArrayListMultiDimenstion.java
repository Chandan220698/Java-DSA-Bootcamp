import java.util.*;
public class ArrayListMultiDimenstion {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		// Initialisation part
		for(int i = 0;	i < 3;	i++)
			list.add(new ArrayList<>());

//				ArrayList{
//							ArrayList 0
//							ArrayList 1
//							ArrayList 2
//						}
		System.out.println("Enter 9 elements");
		for(int i = 0;	i < 3; i++) {
			for(int j = 0;	j < 3;	j++) {
				list.get(i).add(in.nextInt());
			}
		}
//		for i = 0: first ArrayList get filled
//		for i = 1: list.get(1) get filled and within this j = 0, 1, 2: will add elements to 2nd ArrayList
//		list.get(i) means get the list at index i
		
		System.out.println(list);
		
		// Here adding more element to ArrayList< Arraylist at index 1>

		list.get(1).add(369);
		list.get(1).add(111);
		System.out.println("\nArrayList after modifying index 1 ArrayList");	
		System.out.println(list);
		
		list.add(new ArrayList<>());	// Adding another ArrayList to Main list
		
//			ArrayList{
//						ArrayList 0
//						ArrayList 1
//						ArrayList 2
//						ArrayList 3
//					}
		
		list.get(3).add(123);
		list.get(3).add(101);
		System.out.println("\nAdding another Arraylist (Previously 3 ArrayList) & Adding 2 elements to it");
		System.out.println(list);
		
	}

}
