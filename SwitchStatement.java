import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		int i;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any value: ");
		i = scan.nextInt();
	
	switch(i)
	{
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		case 3:
			System.out.println("Case 3");
			break;
		case 4:
			System.out.println("Case 4");
			break;
		case 5:
			System.out.println("Case 5");
			break;
		default:
			System.out.println(" Default");
			break;
	}
		
	}

}
