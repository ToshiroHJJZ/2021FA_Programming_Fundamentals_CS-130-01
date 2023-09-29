enum Color {
	RED,BLUE,WHITE,GREEN,YELLOW;}
public class EnumTest {

	public static void main(String[] args) {
		Color c0 = Color.RED;
		System.out.println(c0);
		System.out.println(c0.name());
		System.out.println(c0.ordinal());
		
		Color c1 = Color.GREEN;
		System.out.println(c1);
		System.out.println(c1.name());
		System.out.println(c1.ordinal());
		
		Color c2 = Color.WHITE;
		System.out.println(c2);
		System.out.println(c2.name());
		System.out.println(c2.ordinal());
		
		Color c3 = Color.BLUE;
		System.out.println(c3);
		System.out.println(c3.name());
		System.out.println(c3.ordinal());
		
		Color c4 = Color.YELLOW;
		System.out.println(c4);
		System.out.println(c4.name());
		System.out.println(c4.ordinal());
	}

}
