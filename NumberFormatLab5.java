import java.text.NumberFormat;
public class NumberFormatLab5 {

	public static void main(String[] args) {
		final double increment = 0.10;
		double oil_price = 2.99, total, subtotal;
		subtotal = oil_price * increment;
		total = subtotal + increment;
		System.out.println(total);
		
		NumberFormat fmt1 = NumberFormat.getCurrencyInstance();
		NumberFormat fmt2 = NumberFormat.getPercentInstance();
		
		System.out.println("Price formated: " + fmt1.format(total));
		System.out.println("Increase: " + fmt2.format(increment));
		
		System.out.println("Oil price of Kentucky : " + fmt1.format(oil_price));
		System.out.println("The oil price in Kentucky increased: " + fmt2.format(increment));
	}

}
