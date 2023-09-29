
public class MethodOverloading_test {

	public static void main(String[] args) {
		
		System.out.println(add(2,3));
	}
public static int add (int number1, int number2)
{
	return number1 + number2;
}
public static int add (int number1,int number2, int number3)
{
	return number1+number2+number3;
}
}
