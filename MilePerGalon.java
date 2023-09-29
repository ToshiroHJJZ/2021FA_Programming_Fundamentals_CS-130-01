import java.util.Scanner;
public class MilePerGalon {

	public static void main(String[] args) {
		int milesdriven, galons_per_tank; 
		float MPG;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of miles driven: ");
		milesdriven = scan.nextInt();
		System.out.println("Enter the number of gallons in the tank: ");
		galons_per_tank = scan.nextInt();
		
		MPG = milesdriven / galons_per_tank;
		
		System.out.println("Your MPG is: " + MPG);
	}

}