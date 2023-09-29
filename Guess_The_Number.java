import java.util.Random;
import java.util.Scanner;
// to get all of the packages then write java.util.*; //

public class Guess_The_Number {

	public static void main(String[] args) {
		
		int guessed_input;
		// 10 random numbers in range 1 to 10
		Random generator = new Random();
		int random_number = generator.nextInt(10)+1; 
		
		//condition check
		while (true)
		{
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Guess your number from 1 to 10: ");
			guessed_input = scan.nextInt();
			
		if (guessed_input == random_number)
		{
			System.out.println("You are correct!!");
			break;
		}
		else if (guessed_input > random_number)
		{
			System.out.println("Your imput is greater than the randomly generated number, Try again");
		}
		else
		{
			System.out.println("Your imput is less than the randomly generated number, Try again");
		}
		}		
}
}
