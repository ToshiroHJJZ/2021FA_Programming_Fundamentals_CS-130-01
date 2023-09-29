
public class Student_Static_Nonstatic {

	String name;
	int age;
	//to save memory call static!
	static String major = "computer science";
	
	public static void main(String[] args) {
		
		Student_Static_Nonstatic student1 = new Student_Static_Nonstatic();
		student1.name ="Sam";
		student1.age = 20;
		
		Student_Static_Nonstatic student2 = new Student_Static_Nonstatic();
		student2.name = "Harry";
		student2.age = 21;
		
		//System.out.println("The major for stdent1 " + student1.major);
		//System.out.println("The major for stdent2 " + student2.major);
		
		System.out.println("The major for student1 " + Student_Static_Nonstatic.major);
		System.out.println("The major for student2 " + Student_Static_Nonstatic.major);

	}

}
