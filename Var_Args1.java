
public class Var_Args1 {

	public static void display(String str, int...number)
	{
		for (int i =0; i<number.length; i++)
{
	System.out.println("The numbers are: " + number[i]);
}
		System.out.println("The string elements are: " + str);
	}
	public static void main(String[] args) {
		
		display("Hello,",10, 20, 30, 04, 59, 98);
		display("class,", 40, 57);
	}

}
