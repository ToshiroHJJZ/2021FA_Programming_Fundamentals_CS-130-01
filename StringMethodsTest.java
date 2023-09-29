public class StringMethodsTest {

	public static void main(String[] args) {
		String phrase = "Change is inevitable";
		String mutation1, mutation2, mutation3;
		System.out.println(phrase);
		System.out.println(phrase.length());
		mutation1 = phrase + " except from vending machines";
		mutation2 = mutation1.toLowerCase();
		mutation3 = mutation1.substring(3);
		System.out.println(mutation1.length());
		System.out.println(mutation2.length());
		System.out.println(mutation3.length());
	}
}