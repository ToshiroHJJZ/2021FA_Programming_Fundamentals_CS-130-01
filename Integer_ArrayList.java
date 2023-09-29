import java.util.ArrayList;
public class Integer_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(20);
		numbers.add(56);
		numbers.add(34);
		numbers.add(24);
		
		System.out.println("Getting the third value " + numbers.get(2));
		
		System.out.println("Size of the array " + numbers.size());
		
		numbers.set(2,67);
		
		numbers.remove(1);
	}
	}