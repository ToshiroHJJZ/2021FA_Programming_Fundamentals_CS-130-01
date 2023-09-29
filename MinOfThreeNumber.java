import java.util.Scanner;
public class MinOfThreeNumber {

	public static void main(String[] args) {
		int number1, number2, number3, min = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		number1 = scan.nextInt();
		System.out.println("Enter the second number: ");
		number2 = scan.nextInt();
		System.out.println("Enter the third number: ");
		number3 = scan.nextInt();

		if (number1 < number2)
		{
			if (number1 < number3)
			{
				min = number1;
			}
			else 
			{
			min = number3;	
			}
		}
		else 
		{
			if (number2<number3)
			{
				min = number2;
			}
			else 
			{
				min =number3;
		}
		}
		System.out.println("The minimum number is: " + min);

	}
}