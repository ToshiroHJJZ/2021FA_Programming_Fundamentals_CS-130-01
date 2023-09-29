
public class even_odd {

	public static void main(String[] args) {
		
int numb [] = new int[11];
		
		numb[0] = 0;
		numb[1] = 1;
		numb[2] = 2;
		numb[3] = 3;
		numb[4] = 4;
		numb[5] = 5;
		numb[6] = 6;
		numb[7] = 7;
		numb[8] = 8;
		numb[9] = 9;
		numb[10] = 10;
		
		for (int i = 0 ; i< numb.length; i ++)
		{
			if (numb[i] % 2 ==0)
			{
				System.out.println("The number " + numb[i] + " is even ");
			}
			else
			{
				System.out.println("The number " + numb[i] + " is odd ");
			}
		
	}

	}
}
