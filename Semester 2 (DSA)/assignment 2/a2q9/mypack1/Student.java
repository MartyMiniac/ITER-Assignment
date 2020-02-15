package mypack1;
import java.util.*;
public class Student
{
	String name;
	int roll;
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Name :");
		name=in.nextLine();
		System.out.print("Enter your Roll Number :");
		roll=in.nextInt();
	}
	public void output()
	{
		System.out.print("Name :"+name);
		System.out.print("Roll Number :"+roll);
	}
}