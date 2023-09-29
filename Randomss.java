import java.util.Random;
public class Randomss {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		Random Generator = new Random();
		
		int out1;
		float out2;
		
		out1 = Generator.nextInt();
		out2 = Generator.nextFloat();
		
		int out3 = (int)out2 + 1;
		int out4 = Generator.nextInt(21); // we get a random number that has a range form 0 to 10 (11), or else. Ex. 20 (21).
		int out5 = Generator.nextInt(21) + 10; // to change position we must add how much we want to change from the original. Ex. program(21)+ 10
		
		int out6 = Generator.nextInt(2) + 15; // this case print numbers from 15 to 17 

		
		System.out.println("The integer random number is: " + out1);
		System.out.println("The float random number is: " + out2);
		System.out.println("The integer random number is: " + out3);
		System.out.println("The integer random number of range 20 is : " + out4);
		System.out.println("The integer random number of range 30 is : " + out5);
		System.out.println("The integer random number of range 30 is : " + out6);
	}

}
