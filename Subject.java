
public class Subject {

	public static void main(String[] args) {
		
		String subject[] = {"Discrete Math", "English Lit.", "Computer Sciences Principles", "Piano Lessons", "BU 100", "BU 099"};
		
		System.out.println("The second element is " + subject[1]);
		System.out.println("The array length is " + subject.length);
		
		
		// for each loop			in == : REMEMBER THAT!!!
		for (String name : subject)
		{
			System.out.println("\n	The subject name: " + name);

		}

		}
	}