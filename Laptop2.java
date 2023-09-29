
public class Laptop2 {

	int Screen_size;
	boolean GPU;
	String model;
	String name;
public Laptop2(boolean GPU, int Screen_size, String model, String name)
{
	this.GPU = GPU;
	this.Screen_size = Screen_size;
	this.model = model;
	this.name = name;
}
	public static void main(String[] args) {
		
		Laptop2 friend1 = new Laptop2(true, 44*67, "HP", "Troung");
		System.out.println("The name of my friend is " + friend1.name);
		
		Laptop2 friend2 = new Laptop2(false, 20*15, "Lenovo", "Linh");
		System.out.println("My second friend " + friend2.name + " has a GPU? " + friend2.GPU);
		
	}
}