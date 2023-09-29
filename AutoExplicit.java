public class AutoExplicit {
	public static void main(String[] args) {
		int number = 30;
		double decimal = number;
		float notwhole = (float)decimal;
		int reverse = (int)notwhole;
		
		System.out.println("The int value is: "+ number);
		System.out.println("The double value is: " + decimal);
		System.out.println("The float point number is: " + notwhole);
		System.out.println("The the integer number is: " + reverse);
	}
}