import java.util.Scanner;
public class FinalConversion {

	public static void main(String[] args) {
		
		
		byte b= 20;
		double d = (double)b;
		float f= (float)d;
		long l = (long)f;
		int i = (int)f;
		byte b1 = (byte)i;
		short s= b1;
		
		System.out.println(b);
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(i);
		System.out.println(b1);		
		System.out.println(s);
		System.out.println("    ");
		
		float temperature;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the actual temperature: ");
		temperature = scan.nextFloat();
		float celsius = ((temperature -32)/9)*5;
		System.out.println("The temperature is now: " + celsius + " in celsius.");
	}
}