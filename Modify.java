import java.util.*;
class Modify{
	public static void main(String[] args)
	{
		Baloon obj = new Baloon("red");
		System.out.println(obj.color);
		modify(obj);
		System.out.println(obj.color);
	}
	public static void modify(Baloon x)
	{
		x.color = "blue";
		//Baloon modObj = new Baloon("blue");
	}
}
class Baloon{
	String color;
	
	Baloon(String color)
	{
		this.color = color;
	}
}