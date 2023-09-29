import java.util.Scanner;
import java.text.DecimalFormat;
public class Triangle_Area {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Side A: ");
		double a = scan.nextDouble();
		System.out.println("Side B: ");
		double b = scan.nextDouble();
		System.out.println("Side C: ");
		double c = scan.nextDouble();
		
		//s is the semiperimeter
		double s = (a + b+ c)/2;
		
		
		double formula = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
DecimalFormat df = new DecimalFormat(".00");
		
		String str = df.format(formula);
		
		System.out.println("The area of the triangle is: " + str);
	}
}