
public class While_sum1 {

	public static void main(String[] args) {
		//add 10 numbers starting from 2 to 11
		int x= 2, sum = 0;
		
		while (x<=11) //or (x<12)
		{
			sum = x+sum;
			System.out.println(sum); 
			x++;
		}
		System.out.println("The result is : " + sum);

	}

}
