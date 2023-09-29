import java.util.Scanner;
public class Pythagorean_Triple {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of side a");
		a = scan.nextInt();
		System.out.println("Enter the length of side b");
		b = scan.nextInt();
		System.out.println("Enter the length of side hypotenuse");
		c = scan.nextInt();
		
		double pythagoream_theorem = (Math.sqrt(Math.pow(a,2) + Math.pow(b, 2)));
		
		if (pythagoream_theorem == c)
		{
		System.out.println("A triangle with side a of " + a + ", side b of " + b + ", and a hypotenuse of " + c + " is a right triangle.");
		}
		else
		{
		System.out.println("A triangle with side a of " + a + ", side b of " + b + ", and a hypotenuse of " + c + " is not a right triangle.");
		}
	}

}
