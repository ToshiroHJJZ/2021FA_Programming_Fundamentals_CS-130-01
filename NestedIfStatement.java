import java.util.Scanner;
public class NestedIfStatement {

	public static void main(String[] args) {
		// criteria of Navy selection:
		// 17-39 years old, and 97- 271 Lb. weight
		//Take user input for age and weight.
		
		int age, weight;
		
		//user input for age and weight
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your age: ");
		age = scan.nextInt();
		System.out.println("Enter the weight " );
		weight = scan.nextInt();
		
		//condition check
		if  ( age >= 17 && age<=39) 
		{
			if (weight >96 && weight <= 272) 
			{
			System.out.print("Your are applicable for NAVY!");
			}
			else 
			{
				System.out.print("You are FAT!, Get a Nutricionist soon, pls");
			}
		}
		else
		{
		System.out.print("You are either too old or too young");	
		}
		  
	}
}
