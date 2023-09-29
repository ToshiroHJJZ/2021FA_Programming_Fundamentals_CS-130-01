
public class Sum_of_natural_numbers {

	public static void main(String[] args) {
		
		int i, j;
		i =1;
		double Sum_while = 0, Sum_for =0;
		while(i<=100)
		{
			Sum_while+= i; //Sum_while = sum_wwhile +1
			i++;
		}
		System.out.println("Addition of 1000 numbers using while loop: " + Sum_while);
		
		for(j = 1; j<=1000; j++)
		{
			Sum_for+=j;
		}
		System.out.println("Addition of 1000 numbers using while loop: " + Sum_for);
	}

}
