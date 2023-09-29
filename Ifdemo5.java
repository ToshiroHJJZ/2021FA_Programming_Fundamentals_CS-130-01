import java.util.Scanner;
public class Ifdemo5 {

	public static void main(String[] args) {
		final int MINOR =17;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int input = scan.nextInt();
		
			if (input <= MINOR)
			{
				System.out.println("The person is a minor!!! Enjoy!!!");
			}
			else
			{
				System.out.println("It's time to take resposibilities!");

			}
		System.out.println("Age is just a number");

	}

}
