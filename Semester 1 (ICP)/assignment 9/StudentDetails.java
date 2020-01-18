//a9q1.java
import java.util.*;
public class StudentDetails
{
	public static void main(String args[])
	{
		Student ob = new Student();
		ob.setData();
		ob.display();
	}
}
class Student
{
	String name;
	int roll, mark;
	Student()
	{
		name="";
		roll=0;
		mark=0;
	}
	void setData()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Name =");
		name=in.nextLine();
		System.out.print("Enter Roll Number =");
		roll=in.nextInt();
		System.out.print("Enter Marks =");
		mark=in.nextInt();
	}
	void display()
	{
		System.out.println("Name = "+name);
		System.out.println("Roll = "+roll);
		System.out.println("Mark = "+mark);
	}
}
