import java.util.Scanner;
public class Number_of_days_in_a_month {
	public static void main(String[] args) {
		int month, year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Write the number of the month: ");
		month = scan.nextInt();
		System.out.println("Write the year: ");
		year = scan.nextInt();
		switch(month)
		{
		case 1:
		System.out.println("This month is Janayary, has 31 days");
		case 2:
			if (year %400 == 0 && month == 2)
			{
				System.out.println("This is a leap year, so February has 29 days");
				break;
			}
			else
			{
			System.out.println("This month is February, has 28 days");
			break;
			}
		case 3:
			System.out.println("This month is March, has 31 days");
			break;
		case 4:
			System.out.println("This month is April, has 30 days");
			break;
		case 5:
			System.out.println("This month is May, has 31 days");
			break;
		case 6:
			System.out.println("This month is June, has 30 days");
			break;
		case 7:
			System.out.println("This month is July, has 31 days");
			break;
		case 8:
			System.out.println("This month is August, has 31 days");
			break;
		case 9:
			System.out.println("This month is Septemer, has 30 days");
			break;
		case 10:
			System.out.println("This month is October, has 31 days");
			break;
		case 11:
			System.out.println("This month is November, has 30 days");
			break;
		case 12:
			System.out.println("This month is December, has 31 days"); //what's next is the break method and the brakets!
			break;
		}
	}
}