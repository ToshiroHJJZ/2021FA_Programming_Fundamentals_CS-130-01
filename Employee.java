public class Employee {

	private String first_name;
	private String last_name;
	private String position;
	private double salary;
	private double hours_worked;
	
public Employee()
{
	this.first_name = " " ;
	this.last_name = " ";
	this.position = " ";
	this.salary = 8.25;
	this.hours_worked = 0.0;
}
public Employee(String first_name, String last_name, String poisition, double salary, double hours_worked) // preferred argument constructor.
{
	this.first_name = first_name ;
	this.last_name = last_name;
	this.position = position;
	this.salary = salary;
	this.hours_worked = hours_worked;
}
	// getters
public String get_First_name()
{
	return first_name;
}
public String get_Last_name()
{
	return last_name;
}	
public String get_position()
{
	return position;
}	
public double get_salary()
{
	return salary;
}	
public double get_hours_worked()
{
	return hours_worked;
}	

//setter (similar to the constructor)
public void set_first_name(String first_name)
{
	this.first_name = first_name;
}
public void set_last_name(String last_name)
{
	this.last_name = last_name;
}
public void set_posititon(String position)
{
	this.position = position;
}
public void set_salary(double salary)
{
	this.salary = salary;
}
public void set_hours_worked(double hours_worked)
{
	this.hours_worked = hours_worked;
}

	public double show_current_pay()
	{
		double pay = 0.0;
		if (hours_worked < 40 )
		{
			pay = hours_worked * salary;
		}
		else
		{
			double over_time = hours_worked-40.0;
			pay = (40 * salary) + (over_time *salary *1.5);
		}
		return pay;
	}
	
	public String display_paychech()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("=====" + first_name.toUpperCase() + " " + last_name.toUpperCase() + "===== \n");
		sb.append("Hours worked: " + hours_worked + "\n");
		sb.append("Position : " + position + "\n");
		sb.append("salary: " + salary + "\n");
		sb.append("Total Pay; " + this.show_current_pay() + "\n");
		
		return sb.toString();
	}
public static void main(String[] args) {
		
Employee person1 = new Employee("John", "Doe", "The Boss", 20.00, 30);
System.out.println(person1.display_paychech());

Employee person2 = new Employee("Caleb", "Gunn", "Painter", 13.50, 45);
System.out.println(person2.display_paychech());
	}
}
