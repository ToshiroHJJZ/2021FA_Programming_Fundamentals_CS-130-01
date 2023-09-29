import java.util.Scanner;
import java.text.DecimalFormat;
public class DecimalFormated {

	public static void main(String[] args) {
		double floating_point, squareroot;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a double-floating point number: ");
		floating_point = scan.nextDouble();
		squareroot = Math.sqrt(floating_point);
		DecimalFormat fmt = new DecimalFormat("0.##");
		System.out.println("The result is: " + squareroot);
		System.out.println("The formated result is: " + fmt.format(squareroot));
	}

}
