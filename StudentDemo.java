import java.util.*;

class Student{
	static int count;
	int rollNo;
	String name;
	int grade;
	void clearedSem()
	{
		grade=grade+1;
	}
	static void decrementCount(){
		count--;
	}
	Student()
	{
		count++;
	}
	
}
class StudentDemo{
	public static void main(String[] args)
	{
		//create instances
		Student a=new Student();
		a.rollNo=1;
		a.name="apple";
		a.grade=1;
		Student b=new Student();
		b.rollNo=2;
		b.name="orange";
		b.grade=2;
		Student c=new Student();
		c.rollNo=3;
		c.name="mango";
		c.grade=2;
		Student d=new Student();
		d.rollNo=4;
		d.name="banana";
		d.grade=3;
		Student e=new Student();
		e.rollNo=5;
		e.name="melon";
		e.grade=1;
		
		//count
		System.out.println("Count: "+Student.count);
		Student.decrementCount();
		System.out.println("Count: "+Student.count);
		
		//print
		System.out.println(a.rollNo + " " + a.name + " " + a.grade);
		a.clearedSem();
		System.out.println(a.rollNo + " " + a.name + " " + a.grade);
		
	}
}