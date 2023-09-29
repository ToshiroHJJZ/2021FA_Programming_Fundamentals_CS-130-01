
public class JavaMath {

	public static void main(String[] args) {

		double x = 16, y = 4, a =60;
		System.out.println("Maximum number if x and y is: " + Math.max(x, y));
		
		
		System.out.println("Square root of x : " + Math.sqrt(x));
		
		
		System.out.println("X power of y : " + Math.pow(x, y));
		
		
		System.out.println("Log of x : " + Math.log(x)); // base e
		System.out.println("Log of y : " + Math.log(y)); // base e
		
		System.out.println("Log of x : " + Math.log10(x)); // base 10
		System.out.println("Log of y : " + Math.log10(y)); // base 10
		
		
		double b = Math.toRadians(a);
		System.out.println("Double value to readians " + b);
		
		System.out.println("trigonometric cosine of b : " + Math.cos(b));
		System.out.println("trigonometric sine of a : " + Math.sin(a));
		System.out.println("trigonometric arc tangent of b : " + Math.atan(b)); // just for tangent is Math.tan(b);


	}

}
