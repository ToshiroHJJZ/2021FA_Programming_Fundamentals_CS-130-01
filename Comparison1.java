public class Comparison1 {
	public static void main(String[] args) {
		
		float a = 2.99f;
		float b = 2.98f;
		if (Math.abs(a-b) < 0.000001) // 0.000001 is the tolerance
		{
			System.out.println("The two numbers are equal");
		
		}
		else
		{
			System.out.println("The two numbers are not equal");
		}
	}
}