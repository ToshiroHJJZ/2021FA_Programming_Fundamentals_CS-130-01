import java.util.Random;
public class RandNum {

	public static void main(String[] args) {
		Random Generator = new Random();
		int randNum;
		randNum = Generator.nextInt(9)+2;
		System.out.println(randNum);
	}
}
