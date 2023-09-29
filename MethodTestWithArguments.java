
public class MethodTestWithArguments {

	public static void main(String[] args) {
		
		informations("Sam",20, "Atrlanta");
		informations("Harry",17, "Nashville");

	}
public static void informations(String name, int age, String city) {
	
	System.out.println("Name of the person is: "  + name  + ". The person is " + age + 
			" years old." + " Location is  " + city);

}
	
}
