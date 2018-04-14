import java.util.*;
import java.io.*;

class ArraySort{
	public static int getMax(int[] array)
	{
		int max=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(max<array[i])
				max=array[i];
		}
		return max;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] array = new int[n];
		for(int i=0;i<n;i++)
			array[i] = sc.nextInt();
		System.out.println("Max "+getMax(array));
	}
}