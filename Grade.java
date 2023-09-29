public class Grade{
	public static void main(String[] args) {
		
		Grade_class [] grades=
			{
				new Grade_class ("A", 95),
				new Grade_class("A-", 90),
		         new Grade_class("B+", 87), 
		         new Grade_class("B", 85), 
		         new Grade_class("B-", 80),
		         new Grade_class("C+", 77), 
		         new Grade_class("C", 75),
		         new Grade_class("C-", 70),
		         new Grade_class("D+", 67), 
		         new Grade_class("D", 65),
		         new Grade_class("D-", 60),
		         new Grade_class("F", 0)
	
	};
		for (Grade_class letterGrade : grades)
	         System.out.println(letterGrade);
	}
}