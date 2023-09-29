
public class Array_Multiplication {

	public static void main(String[] args) {
		// create 15 array elements from 0 to 14
		
		int list[] = new int [15];
		//created an array object for 15 elements
		
		for (int i=0; i<15; i++)
		{
			//we are now multiplying 10 with each of the elements
			list[i] = i * 10;
			System.out.println(list[i]);
		}

	}

}
