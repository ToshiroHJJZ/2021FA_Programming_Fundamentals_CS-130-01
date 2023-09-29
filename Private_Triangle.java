public class Private_Triangle {
private double side_a;
private double side_b;
private double side_c;

public Private_Triangle()
{
	this.side_a = 0;
	this.side_b = 0;
	this.side_c = 0;

}
public Private_Triangle(double side_a, double side_b, double side_c)
{
	this.side_a = side_a;
	this.side_b = side_b;
	this.side_c = side_c;

}
public double get_side_a()
{
	return side_a;
}
public double get_side_b()
{
	return side_b;
}
public double get_side_c()
{
	return side_c;
}
public void set_side_a(double side_a)
{
this.side_a = side_a;
}
public void set_side_b(double side_b)
{
this.side_b = side_b;
}
public void set_side_c(double side_c)
{
this.side_c = side_c;
}


public double area() {
	double s= (side_a + side_b + side_c)/2;
	double area = Math.sqrt(s*(s-side_a)*(s-side_b)*(s-side_c));
	return area;
}
public double perimeter()
{
	double perimeter = side_a +side_b +side_c;
	return perimeter;
}

	public static void main(String[] args) {
		
		Private_Triangle triangle1 = new Private_Triangle(16,14,15);
		System.out.println("The area of the trinagle with sides: " +  triangle1.side_a + ", " +  triangle1.side_b + ", " + triangle1.side_c + " is : " 
		+ triangle1.area() + ". and the perimeter is: " + triangle1.perimeter());
	}
}