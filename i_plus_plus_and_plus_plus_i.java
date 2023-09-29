
public class i_plus_plus_and_plus_plus_i {

	public static void main(String[] args) {
		
//		for (int i =0; i<10; i++)
//		{
//			System.out.println(i);
//		}
//		for (int i =0; i<10; ++i)
//		{
//			System.out.println(i);
//		}
		//no change, example. up there
		
//		int i = 0;    // constant updating variable (so every time a ++1 or ++1 appear i will change.
//		int j = i++; //increment 1 after
//		int z = ++i; //increment 1 before
//		System.out.println("i: " + i);
//		System.out.println("j: " + j);
//		System.out.println("z: " + z);
		
//		for (int i = 1; i <15; i++)
//		
//			{
//			if (i==8)
//				break;
//			System.out.println(i);
//			}
		for (int i = 1; i <15; i++)
		{
			if (i==8)
				continue;
			System.out.println(i);
		}

		for (int i = 1; i <15; i++)
		{
			if (i==2)
				continue;
			if (i == 4)
				break;
			if (i == 7)
				continue;
			System.out.println(i);
		}
	}

}
