
public class NestedLoop {

	public static void main(String[] args) {
		int number1 = 1;
		while(number1<= 10 )
		{
			int number2 = 1;
			while (number2 <=2)
			{
				System.out.println("Here again");
				number2++;
			}
			number1++;
		}	
	}
}
