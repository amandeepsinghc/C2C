import java.util.*;
class StringObj{
	public static void main(String[] args)
	{
		String s1 = "ABC";
		String s2 = "ABC";
		String s3 = new String("DEF");
		String s4 = new String("DEF");
		
		System.out.println(s1==s2);//true 	(checks memory locations)
		System.out.println(s1.equals(s2));//true 	(checks the content)
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true 
	}
}