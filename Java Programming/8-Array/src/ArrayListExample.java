import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		
		// ArrayList is class and part of collection frameworks
		// We cannot pass Primitives(int) only the wrapper class(Integer)
		ArrayList<Integer> list = new ArrayList<>();	// we can provide array initial_size in ArrayList<>(INITIAL_SIZE)
		
		list.add(111);
		list.add(369);
		list.add(36);
		list.add(69);
		list.add(93);
		
		System.out.println(list);
		System.out.println(list.contains(111));
		
		list.set(0, 333);
		list.remove(4);
		System.out.println(list);
		
		for(int i = 0;	i < list.size();	i++) {
			System.out.print(list.get(i) + " ");		// Pass index here, list[index] don't work here
		}
		
		
	}

}
