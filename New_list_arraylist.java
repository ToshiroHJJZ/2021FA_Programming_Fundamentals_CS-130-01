import java.util.*;
public class New_list_arraylist {

	public static void main(String[] args) {
		
		ArrayList<Integer> new_list = new ArrayList<Integer>();
		
		new_list.add(12);
		new_list.add(8);
		new_list.add(34);
		new_list.add(78);
		new_list.add(5);
		
		Iterator<Integer> Iter = new_list.iterator();
		
		while (Iter.hasNext())
		{
			System.out.println("Printing all the elements of: " + Iter.next());
		}


	}

}
