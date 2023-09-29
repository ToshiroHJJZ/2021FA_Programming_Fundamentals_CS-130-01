
public class Array {

	public static void main(String[] args) {
		
		int arr[] = new int[4];
		//adding elements int array
		arr[0]= 23;
		arr[1]= 56;
		arr[2] = 300;
		arr[3] = 54;
		
		System.out.println("The length of the array is: " + arr.length);
		for (int i = 0; i <arr.length; i++) 
		{	
			System.out.println(arr[i]);
		}
		
	}

}
