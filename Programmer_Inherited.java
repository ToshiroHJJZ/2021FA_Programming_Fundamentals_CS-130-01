class Employee115 {
	float salary = 40000.55f;
}
public class Programmer_Inherited extends Employee115 {
	
int bonus = 10000;
// The Programmer_Inherited is child class
// Employee115 is parent class.

	public static void main(String[] args) {
		Programmer_Inherited cp = new Programmer_Inherited();
		
		System.out.println(cp.bonus);
		System.out.println(cp.salary);
	
		
	}

}
