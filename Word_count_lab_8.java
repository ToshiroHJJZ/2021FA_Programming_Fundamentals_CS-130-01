import java.util.ArrayList;
import java.util.Scanner;
public class Word_count_lab_8 {

	public static void main(String[] args) {
		
		String number_count;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter anything, we are going to check if what you wrote has an even or odd number of letters: ");
		number_count = scan.nextLine();
		
		if (number_count.length() % 2 ==0)
		{
			System.out.println("The word count is even");
		}
		else
		{
			System.out.println("The word count is odd");
		}

		
}
}