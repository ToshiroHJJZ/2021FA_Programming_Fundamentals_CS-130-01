import java.util.Scanner;
public class Test_Exam {

	public static void main(String[] args) {
		int height, width, length, area;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Height: ");
		height = scan.nextInt();
		System.out.print("Enter Width: ");
		width = scan.nextInt();
		System.out.print("Enter Height: ");
		length = scan.nextInt();
		
		area = height * width * length;
		System.out.print("The area value is: " + area);

	}

}
