import java.util.Scanner;
public class FloatMath {

	public static void main(String[] args) {
		float number1, number2, sum, difference, product;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a float");
		number1 = scan.nextFloat();
		System.out.println("Enter a float");
		number2 = scan.nextFloat();
		sum = number1 + number2;
		difference = number1 - number2;
		product = number1 * number2;
		
		System.out.println("The first float is: " + number1);
		System.out.println("The second float is: " + number2);
		System.out.println("The sum float is: " + sum);
		System.out.println("The difference between the floats is: " + difference);
		System.out.println("The product float is: " + product);
	}

}
