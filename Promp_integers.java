import java.util.Scanner;
public class Promp_integers {

	
	public static void main(String[] args) {
		int number1,number2,number3,average;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		number1 = scan.nextInt();
		System.out.println("Enter a number");
		number2 = scan.nextInt();
		System.out.println("Enter a number");
		number3 = scan.nextInt();
		
		average = (number1 + number2 + number3)/3;
		
		System.out.println("The first int is: " + number1);
		System.out.println("The second int is: " + number2);		
		System.out.println("The third int is: " + number3);
		System.out.println("The integers are: " + number1 + "," + number2 + "," + number3);
		System.out.println("The average: " + average);
	}

}
