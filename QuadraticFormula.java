import java.util.Scanner;
public class QuadraticFormula {

	public static void main(String[] args) {
		int a,b,c;
		double discriminant, root1, root2;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the coeficient of x squared: ");
		a = scan.nextInt();
		System.out.print("Enter the coeficient of x: ");
		b = scan.nextInt();
		System.out.print("Enter the constant: ");
		c = scan.nextInt(); 
		discriminant= Math.pow(a, 2) + b +c;
		System.out.println(discriminant);
		root1 = - b + Math.sqrt((Math.pow(b,2)-4*a*c)/2*a);
		root2 = - b - Math.sqrt((Math.pow(b,2)-4*a*c)/2*a);
		System.out.println(root1);
		System.out.println(root2);
	}

}
