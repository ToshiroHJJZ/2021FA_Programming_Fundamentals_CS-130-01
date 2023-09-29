import java.util.Scanner;

public class IfelseIf_Satatement {

	public static void main(String[] args) {
		//User input on marks
		int marks;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the marks: ");
		marks = scan.nextInt();
		//condition Check
		
		if (marks <= 60)
		{
			System.out.println("Fail");
		}
		else if (marks >= 60 && marks<70)
		{
			System.out.println("The Grade is D");
		}
		else if (marks>= 70 && marks <80)
		{
			System.out.println("The Grade is C");
		}
		else if (marks >= 80 && marks < 90)
		{
			System.out.println("The Grade is B");
		}
		else if (marks >= 90)
		{
			System.out.println("The Grade is A");
		}
		else
		{
			System.out.println("The Grade is invalid!");
		}
}
}