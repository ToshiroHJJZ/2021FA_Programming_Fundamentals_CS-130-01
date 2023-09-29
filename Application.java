
public class Application {
	
	public static void main(String[] args) {
		
		// The creation of an instance of the main class named StudentClass
		
		StudentClass my_first_student = new StudentClass();
		
		my_first_student.Name ="Historia";
		
		my_first_student.Age=19;
		
		my_first_student.Major="Computer Science";
		
		my_first_student.GPA=3.2;
		
		System.out.println("The major of my first student: " + my_first_student.Major);
		
		
		
		StudentClass second_student = new StudentClass();
		
		second_student.Age = 21;
		second_student.Name = "Grisha";
		second_student.Major = "Proffessor of Geometry";
		second_student.GPA = 5.2;
		
		System.out.println("The name of my second student: " + second_student.Name);
	}
}
