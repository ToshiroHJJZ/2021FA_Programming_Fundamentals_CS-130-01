public class Rectangle_class {
	
	int height;
	int width;
	String color;
	
	
	//constructor 
	public Rectangle_class() //without parameters
	{
		this.height = height;
		this.width = width;
		this.color = color;
	}
	
	public static void main(String[] args) {
	
		Rectangle_class Rectangle1 = new Rectangle_class(); // created an instance of the rectangle class.
		
		Rectangle1.height = 25;
		Rectangle1.width = 15;
		Rectangle1.color = "Blue";
		
		System.out.println("Width of the first rectangle is " + Rectangle1.width);
		System.out.println("The area of the first rectangle is " + Rectangle1.width * Rectangle1.height);
		
		
		Rectangle_class Rectangle2 = new Rectangle_class();
		
		Rectangle2.height = 100;
		Rectangle2.width = 50;
		Rectangle2.color = "Red";

		System.out.println("The perimeter of the second rectangle is " + 2*(Rectangle2.width + Rectangle2.height));
		
		
		
//		//constructor, with parameters
//		Rectangle_class first_rectangle = new Rectangle_class(30,40,"Yellow");
//		System.out.println("Width of the first rectangle is " + first_rectangle.width);
//		
//		
//		Rectangle_class second_rectangle = new Rectangle_class(100,50, "white");
//		System.out.println("The color of the second rectangle is " + second_rectangle.color);
//		
//		Rectangle_class r1 = new Rectangle_class();
//		r1.color = "Blue";
//		Rectangle_class r2 = r1;
//		r2.color = "Red";
//		System.out.println(r1 + " " + r2);

	}
}