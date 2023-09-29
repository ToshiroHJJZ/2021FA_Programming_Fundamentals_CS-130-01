import java.text.NumberFormat;
import java.util.Scanner;
public class NumberFormatExample {

	public static void main(String[] args) {
		final double TAX_RATE = 0.06;
		double subtotal, tax, total_cost;
		Scanner scan_price = new Scanner(System.in);
		System.out.print("Enter the price of your object in dollars ");
		subtotal = scan_price.nextDouble();
		tax = subtotal * TAX_RATE;
		System.out.println("Tax : " + tax);
		total_cost = tax + subtotal;
		System.out.println("total cost " + total_cost);
		
		
		NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
		NumberFormat fmt2 = NumberFormat.getPercentInstance();
		
		System.out.println("Tax formated: " + fmt1.format(tax));
		System.out.println("Tax rate: " + fmt2.format(TAX_RATE));


		

	}

}
