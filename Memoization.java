import java.util.*;
import java.io.*;

class Memoization{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of inputs :");
		int n = sc.nextInt();
		int[] input = new int[n];
		System.out.println("Enter numbers :");
		for(int i=0;i<n;i++)
		{
			input[i] = sc.nextInt();
		}
		int max = ArraySort.getMax(input);
		long[] output = new long [max+1];
		output[0]=1;
		for(int i=1;i<=max;i++)
		{
			output[i]=i*output[i-1];
			output[i]=output[i]%10000007;
		}
		System.out.println("Input  Output");
		for(int i=0;i<n;i++)
		{
			System.out.println(input[i]+"        "+output[input[i]]);
		}
	}
}