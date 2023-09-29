
public class Encapsulation1 {
private String name;
private int age;
private String major;
private double gpa;
// Getter methods 
public String getName()
{
	return name;
}
public int getAge()
{
	return age;
}
public String getMajor()
{
	return major;
}
public double getgpa()
{
	return gpa;
}

// Setter method. It work similar as JAVA Constructor.

public void setName(String name)
{
	this.name=name;
}
public void setage(int age)
{
	this.age=age;
}
public void setMajor (String major)
{
	this.major=major;
}
public void setgpa(double gpa)
{
	this.gpa=gpa;
}

	public static void main(String[] args) {
		//Created an instance of an encapsulation1 class.
		Encapsulation1 obj = new Encapsulation1();
		obj.setName("Jonathan");
		obj.setage(20);
		obj.setMajor("Computer Science");
		obj.setgpa(3.5);
		
		System.out.println("The name is :" + obj.getName());
		System.out.println("The age of the person is: " + obj.getAge());
		System.out.println("The major of the person is: " + obj.getMajor());
		System.out.println("The gpa of the person is: " + obj.getgpa());
	}

}
