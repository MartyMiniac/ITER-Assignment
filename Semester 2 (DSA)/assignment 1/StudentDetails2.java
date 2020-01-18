//a1q10
class Student2
{
	String name;
	int roll, marks;
	public void setData()
	{
		name="";
		roll=0;
		marks=0;
	}
	public void setData(String s, int i, int j)
	{
		name=s;
		roll=i;
		marks=j;
	}
	public void display()
	{
		System.out.println("Name = "+name);
		System.out.println("Roll Number = "+roll);
		System.out.println("Marks = "+marks);
	}
}
public class StudentDetails2
{
	public static void main(String args[])
	{
		Student2 ob1 = new Student2();
		Student2 ob2 = new Student2();
		Student2 ob3 = new Student2();
		ob1.setData();
		ob2.setData("Marty",16,100);
		ob3.setData("Aradhya",15,95);
		ob1.display();
		ob2.display();
		ob3.display();
		
	}
}