
public class MethodOverloading_test2 {

	public static void main(String[] args) {
		
		System.out.println(add(10,12.22f));
		System.out.println(add(10.33f,12));
		
	}
public static int add(int number11, int number12)
{
	return number11+number12;
}
}
