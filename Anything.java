import java.util.Scanner;
import java.text.DecimalFormat;
public class Anything {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Coordinate x: ");
		double x = scan.nextDouble();
		System.out.println("Coordinate y: ");
		double y = scan.nextDouble();
		System.out.println("2nd Coordinate x: ");
		double x2 = scan.nextDouble();
		System.out.println("2nd Coordinate x: ");
		double y2 = scan.nextDouble();
		
		double formula = Math.sqrt(Math.pow(x2-x,2)+Math.pow(y2-y,2));
		
		DecimalFormat df = new DecimalFormat(".00");
		
		String str = df.format(formula);
		System.out.println("The distance between [" + x + ", " + y + "] and [" + x2 + ", " + y2 + "] is: " + str);
	}
}