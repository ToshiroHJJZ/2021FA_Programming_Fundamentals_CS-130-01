import java.util.ArrayList;
import java.util.Iterator;
public class New_list_remove_method {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(23);
		numbers.add(8);
		numbers.add(31);
		numbers.add(45);
		numbers.add(6);
		numbers.add(7);
		numbers.add(19);
		numbers.add(15);
		
		Iterator<Integer> Iter = numbers.iterator();
		while (Iter.hasNext())
			{
				Integer numbers1 = Iter.next();
				if (numbers1 <10 || numbers1 >20)
				{
					Iter.remove();
				}
		}
			System.out.println(numbers);
	}
}