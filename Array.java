import java.util.*;
class Array{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=3;
		int[][] a  = new int[n][n];
		int[] row = new int[n];
		int[] col = new int[n];
		int diag1=0,diag2 = 0;
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				a[i][j]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				row[i]+=a[i][j];
				col[i]+=a[j][i];
				if(i==j)
					diag1+=a[i][j];
				if(i+j==n-1)
					diag2+=a[i][j];
			}
		}
		System.out.println(Arrays.toString(row));
		System.out.println(Arrays.toString(col));
		System.out.println(diag1);
		System.out.println(diag2);
	}
}