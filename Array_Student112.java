
public class Array_Student112 {

	public static void main(String[] args) {
		
		Student112 arr2[] = new Student112 [5]; // Allocating memory space for 5 objects of type Student112.
		
		arr2[0] = new Student112("Sam", 12); // initialize the first element of the array.
		arr2[1] = new Student112("Shiro", 14);
		arr2[2] = new Student112("Daniela", 21);
		arr2[3] = new Student112("Hugo", 13);
		arr2[4] = new Student112("Claraz", 19);
		
		//PRINTTING ALL THE ARRAY ELEMENTS USING FOR LOOP!!!
		
		for (int i = 0; i<arr2.length; i++)
		{
			System.out.println("The index is " + i + " The array element name is " + arr2[i].name + " and the age "+ arr2[i].roll_no);
		}		

		}
	}