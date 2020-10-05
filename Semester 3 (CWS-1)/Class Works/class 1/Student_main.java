import java.util.*;
public class Student_main
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your Name : ");
		String name=in.nextLine();
		System.out.print("Enter your Registration Number : ");
		long regno=in.nextLong();
		in.nextLine();
		System.out.print("Enter your Branch : ");
		String branch=in.nextLine();
		System.out.print("Enter your Section : ");
		char section=in.nextLine().charAt(0);
		System.out.print("Enter your Mark1 : ");
		int mark1=in.nextInt();
		System.out.print("Enter your Marks2 : ");
		int mark2=in.nextInt();
		Student ob = new Student(name, branch, section, regno, mark1, mark2);
		ob.add();
	}
}
