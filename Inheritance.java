import java.util.*;
class Parent{
	public void method1()
	{
		System.out.println("Method 1");
	}
	int x = 5;
}
class Child extends Parent{
	public void method1()
	{
		System.out.println("Method 2");
	}	
}
class Inheritance{
	public static void main(String[] args){
		Parent c= new Child();
		c.method1();
		System.out.println(c.x);
	}
}