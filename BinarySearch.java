import java.util.*;
 
class BinarySearch{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] a = {3,5,7,19,45,49};
		int start = 0;
		int end = a.length-1;
		int mid = 0,count=0;
		int location=999;
		int x = sc.nextInt();
		while(count<7){
			mid=(start+end)/2;
			if(a[mid]==x)
			{
				location=mid;
				break;
			}
			if(a[mid]>x)
				end = mid;
			else if(a[mid]<x)
				start = mid+1;
			count++;
		}
		System.out.println(location);
	}
}