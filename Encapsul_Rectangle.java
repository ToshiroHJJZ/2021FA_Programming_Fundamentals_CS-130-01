
public class Encapsul_Rectangle {

	private int height;
	private int width;
	
	//getter method for height and width
	
	public int getHeight()
	{
		return height;
	}
	public int getWidth()
	{
		return width;
	}
	
	//setter for height and width
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	//find area and perimeter.
	public int area_Rectangle()
	{
		int area = height * width;
		return area;
	}
	public int perimeter_Rectangle()
	{
		int perimemter = 2 * (height * width);
		return perimemter;
	}
	
	public static void main(String[] args) {
		// find a way to use the other class in the main class
		Encapsul_Rectangle rectangle1 = new Encapsul_Rectangle();
		
		//set values for height and width
		rectangle1.setHeight(30);
		rectangle1.setWidth(20);
		
		System.out.println("The area of the rectangle " + rectangle1.area_Rectangle() + " and the perimeter of the rectangle is " + rectangle1.perimeter_Rectangle());
	}
}