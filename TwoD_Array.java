
public class TwoD_Array {

	public static void main(String[] args) {
		
		int [] [] Scores = {{1,2,3},
							{4,5,6},
							{8,9,20}
		};
		//System.out.println(Scores[1][1]);
		//System.out.println(Scores[2][2]);
for (int i = 0; i<Scores.length; i++)
{
	for (int j = 0; j<Scores[i].length; j++)
{
	System.out.print(Scores[i][j]);
}
System.out.println(" ");
	}
	}

}
