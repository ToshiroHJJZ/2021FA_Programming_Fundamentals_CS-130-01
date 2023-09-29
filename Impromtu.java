import java.util.Scanner;
public class Impromtu {

	public static void main(String[] args) {

		String name, hobby; 
		int age;
		float hours_spent_in_java;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name = scan.nextLine();
		name.toUpperCase();
		System.out.println("Enter your hobby: ");
		hobby = scan.nextLine();
		hobby.toUpperCase();
		System.out.println("Enter your age: ");
		age = scan.nextInt();
		System.out.println("Enter the amount of time spent in java: ");
		hours_spent_in_java = scan.nextFloat();
		
System.out.println("Your name is " + name + ", your favorite hobby is " + hobby + ", your age is " + age +   " and the total hours spent in java have been "+ hours_spent_in_java + " hours.");
	}

}
