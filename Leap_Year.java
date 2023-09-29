import java.util.Scanner;
public class Leap_Year {

	public static void main(String[] args) {
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year: ");
		year = scan.nextInt();
		
		while (year>-1)
		{
		if ((year %4 == 0 && year %100 != 0) || year %400 == 0)
		{
			System.out.println("This is leap year !");
		}
		else
		{
			System.out.println("This is a normal year :( ");
		}
		System.out.println("Enter a 4-digit year (-1 to quit): ");
		 year = scan.nextInt();
		 if (year==-1)
		 {
			 System.out.println("I'll see you another time...");
			 break;
		 }
		}
	}
}