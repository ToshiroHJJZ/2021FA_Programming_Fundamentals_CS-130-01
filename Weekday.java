import java.util.Scanner;
public class Weekday {

	public static void main(String[] args) {
		
		int number;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please give the number that represens the day of the week. 1 for Sunday,  7 for Saturday: ");
		number = scan.nextInt();
		
		switch(number){
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
		}	
	}
}
