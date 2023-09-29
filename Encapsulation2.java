
public class Encapsulation2 {
private String make; 
private String model;
private int screen_size;
private boolean GPU;

//Getter method for the private class
public String getmake()
{
	return make;
}
public String getmodel()
{
	return model;
}
public int getscreen_size()
{
	return screen_size;
}
public boolean getGPU()
{
	return GPU;
}

//setter for all the methods
public void setmake (String make){
	this.make= make;
}
public void setmodel (String model){
	this.model= model;
}public void setscreen_size (int screen_size){
	this.screen_size= screen_size;
}
public void setGPU (boolean GPU){
	this.GPU=GPU;
}
	public static void main(String[] args) {
		Encapsulation2 myLaptop = new Encapsulation2();
		myLaptop.setmake("DELL");
		myLaptop.setmodel("Desktop");
		myLaptop.setscreen_size(24*13);
		myLaptop.setGPU(true);
		
		System.out.println("My laptop make: " + myLaptop.getmake());
		System.out.println("My laptop model: " + myLaptop.getmodel());
		System.out.println("My laptop screen_size: " + myLaptop.getscreen_size());
		System.out.println("My laptop has GPU? " + myLaptop.getGPU());

		

	}

}
