public class Private_student {

	private String name;
	private int age;
	private String major;
	private String hobby;
	private double expected_GPA;
	private double spent_time_learn_JAVA;
	
public Private_student()
{
	this.name = " " ;
	this.age = 0;
	this.major = " ";
	this.hobby = " ";
	this.expected_GPA = 0.0;
	this.spent_time_learn_JAVA = 0;
}
public Private_student(String name, int age, String major, String hobby, double expected_GPA, double spent_time_learn_JAVA) // preferred argument constructor.
{
	this.name = name ;
	this.age = age;
	this.major = major;
	this.hobby = hobby;
	this.expected_GPA = expected_GPA;
	this.spent_time_learn_JAVA = spent_time_learn_JAVA;
}
	// getters
public String get_name()
{
	return name;
}
public int get_age()
{
	return age;
}	
public String get_major()
{
	return major;
}	
public String get_hobby()
{
	return hobby;
}	
public double get_expected_GPA()
{
	return expected_GPA;
}	
public double get_spent_time_learn_JAVA()
{
	return spent_time_learn_JAVA;
}

//setter (similar to the constructor)
public void set_first_name(String name)
{
	this.name = name;
}
public void set_age(int age)
{
	this.age = age;
}
public void set_major(String major)
{
	this.major = major;
}
public void set_hobby(String hobby)
{
	this.hobby = hobby;
}
public void set_expected_GPA(double expected_GPA)
{
	this.expected_GPA = expected_GPA;
}
public void set_spent_time_learn_JAVA(double spent_time_learn_JAVA)
{
	this.spent_time_learn_JAVA = spent_time_learn_JAVA;
}

	public boolean HonorsEligible()
	{
		boolean eligible;
		if (expected_GPA > 3.5 )
		{
			eligible = true;
		}
		else
		{
			eligible = false;
		}
		return eligible;
	}
	
	public String display_paychech()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("=====" + name.toUpperCase() + "===== \n");
		sb.append("Age: " + age + "\n");
		sb.append("Major : " + major + "\n");
		sb.append("Hobby: " + hobby + "\n");
		sb.append("GPA: " + expected_GPA + "\n");
		sb.append("Honors eligible: " + this.HonorsEligible() + "\n");
		sb.append("===== EXTRA: ===== \n " + spent_time_learn_JAVA + "\n");

		
		return sb.toString();
	}
	public static void main(String[] args) {
		
		Private_student person1 = new Private_student("Jonathan Penaloza", 19, "Computer Science", "Piano" , 3.96, 0);
System.out.println(person1.display_paychech());

Private_student person2 = new Private_student("Samantha Road", 18 , "Neuroscience", "Shopping", 4.3, 0);
System.out.println(person2.display_paychech());
	}
}
