import java.util.*;
class ArrayMod {
	public static void main(String[] args){
		int[] a = {5,5,5,5};
		modify(a);
		System.out.println(Arrays.toString(a));
	}
	public static void modify(int[] a)
	{
		a[0]=100;
	}
}