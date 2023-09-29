import java.util.Scanner;

public class Two_Floating_numbers {

	public static void main(String[] args) {
		double number1, number2 ;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please write a number with decimals: ");
		number1 = scan.nextDouble();
		
		System.out.println("Please write another number with decimals: ");
		number2 = scan.nextDouble();
		
		double tolerance = 0.001;

		if (Math.abs(number1 - number2) < tolerance)
		{
			System.out.println("The numbers are not the same");
		}
		else
		{
			System.out.println("The numbers are the same");
		}
		
	}

}
