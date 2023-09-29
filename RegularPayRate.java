import java.util.Scanner;
public class RegularPayRate {

	public static void main(String[] args) {
		double rate = 8.25;
		int standard_hours = 40;
		double pay;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the hours you work: ");
		int hours = scan.nextInt();
		if (hours > standard_hours){
			pay = (hours - standard_hours) * (rate *1.5) + (standard_hours * rate);
		}
		else {
		pay =	hours * rate;
		}
		System.out.println("The person gets paid: " + pay);
	}

}
