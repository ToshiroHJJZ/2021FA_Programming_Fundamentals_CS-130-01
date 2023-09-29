import java.util.Scanner;
public class Names {

	public static void main(String[] args) {
		String name, last_name;
		Scanner scan = new Scanner(System.in);
		System.out.println("Your first name: ");
		name = scan.next();
		System.out.println("Your last name: ");
		last_name = scan.next();
		System.out.println("You are: " + name.toLowerCase().substring(0,1) + ". " +  last_name.toLowerCase());
	}
}
