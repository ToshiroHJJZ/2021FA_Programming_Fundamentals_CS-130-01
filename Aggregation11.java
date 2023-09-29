
public class Aggregation11 {

	public static void main(String [] args)
	{
		Author author_one = new Author("Jack", 28);
		Book book1 = new Book(23, "JAVA", author_one);
		
		System.out.println("Book ID is: " +  book1.bookID);
	}
}
