import java.util.Scanner;
public class Sun_and_average {

	public static void main(String[] args) {
		int number = 0, sum = 0;
		double average;
		
		while (number < 6)
		{
		Scanner scan = new Scanner(System.in);
		System.out.println("Place your number");
			number = scan.nextInt();
		sum = sum + number;
		number++;
		}		
		
		average = sum /5;
  
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
	}
}