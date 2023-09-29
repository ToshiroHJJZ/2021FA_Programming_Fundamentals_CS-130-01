
public class ArrayTesrFor_Each {

	public static void main(String[] args) {
		
		double arr1 [] = new double [10];
		arr1[0] = 12.23;
		arr1[1]	= 54.32;
		arr1[2] = 71.59;
		arr1[3] = 158.54;
		arr1[4] = 37.5;
		arr1[5] = 39.03;
		arr1[6] = 29.45;
		arr1[7] = 469.56789;
		arr1[8] = 12.32;
		arr1[9] = 3.222;
	// For loop to display all the array elements
		for( int i = 0; i<arr1.length; i++)
		{
			System.out.println("The elements index " + i + ". The element is : " + arr1[i]);
		}
	// For each loop to display all array elements
		int index = 0;
		//for index 
		for (double element : arr1)
		{
			System.out.println("The elements index " + (index++) + ". The element using for each loop " + element);
		}
}

}
