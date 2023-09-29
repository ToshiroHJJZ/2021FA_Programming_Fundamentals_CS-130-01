import java.util.Scanner;
import java.text.DecimalFormat;
public class Sphere {
	public static void main(String[] args) {
		double r, sqrtt;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the sphere: ");
		r = scan.nextDouble();
		
		double v = (4* Math.PI * r * 3)/3;
		System.out.println("The volume of the Sphere is: " + v);
		DecimalFormat fmt = new DecimalFormat("0.####");
		System.out.println("The formated result is: " + fmt.format(v));
	}	
	}
