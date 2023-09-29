import java.util.Scanner;

public class SwitchTest3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter grade: ");
		int grade = scan.nextInt();
		int category =grade / 10;
		
		switch(category)
		{
		case 10:
		System.out.println("A");
		break;
		case 9:
		System.out.println("B");
		break;
		case 8:
		System.out.println("C");
		break;
		case 7:
		System.out.println("D");
		break;
		default:
		System.out.println("You failed");
		break;
		}
		
	}

}
