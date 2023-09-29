
public class Practice_String {

	public static void main(String[] args) {
		String s = "Jonathan Jose Penaloza Rumie";
		String s1 = new String("Jonathan Jose Penaloza Rumie"); // using new keyword
		System.out.println("printing the sting " + s);
		System.out.println("printing the new sting " + s1);
		
		
		System.out.println("String length " + s.length());
		System.out.println("Printing the 5th character of the String " +  "'"+ s.charAt(6) + "'.");
		
		
		System.out.println("Substing " + s.substring(1));
		System.out.println("Substing " + s.substring(0,8));
		
		
		String s10 = "Jonathan"; String s11 = " Penaloza";
		System.out.println("Concatinatied String = " + s10.concat( s11 ));
		
		
		String word1 = "JonAThAN";
		System.out.println("Changing to lower case " + word1.toLowerCase());
		System.out.println("Changing to upper case " + word1.toUpperCase());
		
		String s12 = "Jonathan".replace('a', 'u');
		System.out.println("Replaced 'a' with a 'u' " + s12);
		
		System.out.println("Index of 'ona' " + s.indexOf("ona"));
		System.out.println("Index of 'Jo' " + s.indexOf("Jo", 2));
		
		//variable(string).indexOf("(specicific word you want)"));
		String p = "JonathanPenaloza";
		System.out.println("Index of Pen " + p.indexOf("Pen"));
		//variable.indexOf("word",first ocurrence (first time it appears so you can skip it) (in int) == (word,int);
		System.out.println("Index of na " + p.indexOf("na",4));
		//lastIndexOf("a");
		System.out.println("Index of a " + p.indexOf("a"));
		
		//boolean equals(Object other object);
		Boolean out = "Jonathan".equals("Jonathan");
		Boolean nort = "Jonathan".equals("jonathan");
		System.out.println("Checking Equality " + out); 	System.out.println("Checking Equality " + nort);
		// equalsIgnoreCase(String another String);
		out = "JONATHan".equalsIgnoreCase("JoNaThAn "); //the upper and lower case are ignored, but the spaces are not!
		System.out.println("Checking Equality " + out);




	}

}
