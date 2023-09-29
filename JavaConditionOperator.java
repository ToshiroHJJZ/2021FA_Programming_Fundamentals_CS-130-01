
public class JavaConditionOperator {

	public static void main(String[] args) {
		int Sam = 23, Jenny = 25;
		
		//condition ? expression1 : expression2 
		// If condition true, expression 1 is evaluated.
		// If it is false, expression2 is evaluated.
		
		System.out.println("The elder person is " + ((Sam>Jenny ? "Sam" : "Jenny")) );
	}

}
