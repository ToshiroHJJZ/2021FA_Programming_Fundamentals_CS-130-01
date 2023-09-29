
public class InstanceMethod {

	public int RectaArea(int height, int width)
	{
		return height * width;
	}
	
	public static int RectArea1(int height, int width)
	{
		return height * width;
	}
	public static void main(String[] args) {
		
		InstanceMethod rectangle1 = new InstanceMethod();
		System.out.println("The are is : " + rectangle1.RectaArea(20,30));
		
		System.out.println("The area using static methdo " + InstanceMethod.RectArea1(10,20));
	}

}
