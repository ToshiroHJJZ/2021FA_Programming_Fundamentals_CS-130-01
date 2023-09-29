
public class DotCompareTo {

	public static void main(String[] args) {
		
		String Name1 = "book";
		String Name2 = "bookcase";
		
		if (Name1.compareTo(Name2) < 0 )
		{
			System.out.println("Name 1 is bigger");
		}
		else if (Name1.compareTo(Name2) == 0 )

		{
			System.out.println("Both names are the same");
		}
		else 
		{
			System.out.println("Name 2 is bigger");

		}
	}

}
