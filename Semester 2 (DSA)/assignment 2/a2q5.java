import java.util.*;
public class a2q5
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Student\'s Name : ");
		String name=in.nextLine();
		System.out.print("Enter Student\'s Age : ");
		int age=in.nextInt();
		in.nextLine();
		Student s = new Student(name, age);
		System.out.print("Enter Student\'s Course : ");
		s.setCourse(in.nextLine());
		System.out.print("Enter Student\'s Roll Number : ");
		s.setRollNumber(in.nextInt());
		System.out.print("Enter Student\'s Marks : ");
		s.setMarks(in.nextInt());
		s.display();
	}
}
class Person
{
	String name;
	int age;
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
}
class Student extends Person
{
	String course;
	int roll_number, marks;
	Student(String name, int age)
	{
		super(name, age);
	}
	public void setCourse()
	{
		course="";
	}
	public void setCourse(String s)
	{
		course=s;
	}
	public void setRollNumber()
	{
		roll_number=0;
	}
	public void setRollNumber(int i)
	{
		roll_number=i;
	}
	public void setMarks()
	{
		marks=0;
	}
	public void setMarks(int i)
	{
		marks=i;
	}
	public void display()
	{
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Course = "+course);
		System.out.println("Roll Number = "+roll_number);
		System.out.println("Marks = "+marks);
	}
}
class Teacher extends Person
{
	String subject_assigned;
	int contact_hour;
	Teacher(String name, int age)
	{
		super(name, age);
	}
	public void setSubjectAssigned()
	{
		subject_assigned="";
	}
	public void setSubjectAssigned(String s)
	{
		subject_assigned=s;
	}
	public void setContractHour()
	{
		contact_hour=0;
	}
	public void setContractHour(int i)
	{
		contact_hour=i;
	}
	public void display()
	{
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Subject Assignned : "+subject_assigned);
		System.out.println("Contract Hours : "+contact_hour);
	}
}
