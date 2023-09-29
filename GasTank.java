import java.util.Scanner;
public class GasTank {

	public static void main(String[] args) {
		double capacity, amount_left; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter you capacity of fuel of you car: ");
		capacity = scan.nextDouble();
		System.out.println("Please enter what is left of your fuel of you car: ");
		amount_left = scan.nextDouble();
		double level = amount_left/capacity;
		
		if (level<=0.25)
		{
			System.out.println("Level less than a quarter (<.25) of a tank");

		}
		else if (level<=0.50)
		{
			System.out.println("Level less than a half (<.50) of a tank");

		}
		else if (level<=0.75)
		{
			System.out.println("Level less than three quarters (<.75) of a tank");

		}
		else
		{
		System.out.println("Almost a full tank");
		}
	}
}