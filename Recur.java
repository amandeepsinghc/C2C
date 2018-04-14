import java.util.*;
import java.io.*;

class Recur{
	public static int fact(int n)
	{
		if(n==1)
			return 1;
		return n*fact(n-1);
	}
	public static int factItr(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args)
	{
		System.out.println(fact(5));
		System.out.println(factItr(5));
	}
}