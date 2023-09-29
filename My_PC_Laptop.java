
public class My_PC_Laptop {

	public static void main(String[] args) {
		
		LaptopClass my_laptop = new LaptopClass();
		
		my_laptop.GPU = true;
		my_laptop.Model = "DELL";
		my_laptop.Screen_size = 24*27;
		my_laptop.Name = "PAST002-22";
		
		System.out.println("The size of the creen is: " + my_laptop.Screen_size + " inches squared.");
	}

}
