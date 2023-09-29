import java.util.*;

//import java.util.ArrayList;
//import java.util.Iterator;
public class Iterator_arrayList {

	public static void main(String[] args) {
		
		ArrayList<String> new_name = new ArrayList<String>();
		
		new_name.add("Joni");
		new_name.add("Nick");
		new_name.add("Eric");
		new_name.add("Cleetus");
		new_name.add("Alise");
		new_name.add("Ashley");
		
		Iterator<String> Iter = new_name.iterator();
		
		System.out.println("Printing the first item of the array list: " + Iter.next()); //.next will give back the first element of the class.
		
		// print all the elements of the arrayList using hasNext() method, to do it we need a condition check
		
		while (Iter.hasNext())
		{
			//System.out.println("Printing all the items of the array list: " + Iter.next()); 
			//even though the next() method is called twice, it remembers the first value and starts with the nick element and not the Joni one.
			
			String name = Iter.next();
			
			if (name == "Cleetus")
			continue;
			
			{
				Iter.remove();
			}
			System.out.println("Printing all the items of the array list: " + Iter.next()); 

		}
	}

}
