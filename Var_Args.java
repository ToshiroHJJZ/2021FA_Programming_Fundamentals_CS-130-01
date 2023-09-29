public class Var_Args {

	public static int sum(int...list)
	{
		int total = 0;
		for (int i =0; i<list.length; i++)
		{
			total = total + list[i];
		}
		return total;
	}
	
	
	public static double mult(double...list)
	{
		double total = 1;
		for (int j = 0; j < list.length; j++)
		{
			total = total* list[j];
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		System.out.println("The first sum, " + sum(1,2,3,4,5));
		System.out.println("The first sum, " + sum(1,2,3,4,5,7,11));
		
		System.out.println("The first multiplication, " + mult(1.22,2.345,3.862,4.428,5.45,7.10,11.49));		
		System.out.println("The first multiplication, " + mult(1,2,3,4,5,7,11));
	}
}