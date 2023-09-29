import java.text.DecimalFormat;
import java.util.Scanner;
public class DecimalFormatExample {

	public static void main(String[] args) {
		double radius;
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the radius: ");
		radius = scan.nextDouble();
		
		//area = pi * r^2
		double area = Math.PI * Math.pow(radius,2);
		
		//circumference = 2*pi*r
		double circumference = 2* Math.PI * radius;
		
		//I'll print the decimal values based on the hash count
		DecimalFormat fmt = new DecimalFormat("0.##");
		System.out.println("The area of the circle: " + fmt.format(area));
		System.out.println("The area of the circumference " + fmt.format(circumference));

	}

}