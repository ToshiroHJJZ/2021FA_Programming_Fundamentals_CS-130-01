import java.util.Scanner;
public class Employee_number {

	public static void main(String[] args) {
		
		int category;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your corresponding number 100, 200, 300, 400: ");
		category = scan.nextInt();
		
		switch(category)
		{
		case 100:
		System.out.println("General Manager");
		break;
		case 200:
		System.out.println("Supervisor");
		break;
		case 300:
		System.out.println("Staff");
		break;
		case 400:
		System.out.println("Contractor");
		break;
		default:
		System.out.println("Invalid category.");
		break;
		}
	}
}