
public class Encapsul_Circle {

	private double radius;

	public double getRadius()
	{
		return radius;
	}
	//setter for height and width
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double area_circle()
	{
		double area = Math.PI * Math.pow(radius, radius);
		return area;
	}
	public double perimeter_circle()
	{
		double perimemter = 2 * Math.PI * radius;
		return perimemter;
	}
	
	public static void main(String[] args) {
		// find a way to use the other class in the main class
		Encapsul_Circle circle1 = new Encapsul_Circle();
		
		//set values for height and width
		circle1.setRadius(10.22);
		
		System.out.println("The area of the rectangle " + circle1.area_circle() + " and the perimeter of the rectangle is " + circle1.perimeter_circle());
}
}