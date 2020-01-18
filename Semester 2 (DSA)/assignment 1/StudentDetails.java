//a1q9
import java.util.*;
class Student
{
	String name;
	int roll, marks;
	Student()
	{
		name="";
		roll=0;
		marks=0;
	}
	public void setData()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Name :");
		name=in.nextLine();
		System.out.print("Roll Number :");
		roll=in.nextInt();
		System.out.print("Marks :");
		marks=in.nextInt();
	}
	public void display()
	{
		System.out.println("Name = "+name);
		System.out.println("Roll Number = "+roll);
		System.out.println("Marks = "+marks);
	}
}
public class StudentDetails
{
	public static void main(String args[])
	{
		Student ob1 = new Student();
		Student ob2 = new Student();
		Student ob3 = new Student();
		ob1.setData();
		ob2.setData();
		ob3.setData();
		ob1.display();
		ob2.display();
		ob3.display();
		
	}
}