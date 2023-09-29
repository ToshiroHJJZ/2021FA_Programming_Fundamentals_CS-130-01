import java.util.ArrayList;
import java.util.Iterator;
public class Array_List {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Jonathan");
		names.add("Shiro");
		names.add("Kiet");
		names.add("Jhin");
		
		System.out.println(names);
		System.out.println("The first element of the arrayList: " + names.get(0));
		System.out.println("Access Harry of the arrayList: " + names.get(2));
		
		//the .set method helps to update the value of an array
		
		names.set(1, "Anny");
		System.out.println(names);
		
		// .remove to remove an element from the arrayList
		
		names.remove(1);
		System.out.println(names);
		
		// .size to get the size of the arrayList
		
		System.out.println("The length of the arrayList: " + names.size());
		
		// .clear method will be removed at once, giving back an empty list
		
		//names.clear();
		//System.out.println(names);
		
		for (int i = 0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		// For each method
		for (String j : names)
		{
			System.out.println("Using For each method " + j);

		}
		Iterator<String> Iter = names.iterator();
		while (Iter.hasNext())
		{
			String name = Iter.next();
			if (name == "Kiet")
			{
				Iter.remove();
		}
		System.out.println("Printing the first item of tghe arra list" + names);
		}
	}

}
