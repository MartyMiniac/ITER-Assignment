//a3q3.java
import java.util.*;
public class Student
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the name of Student :");
		String name=in.nextLine();
		System.out.print("Enter the Marks obtained :");
		int marks=in.nextInt();
		try
		{
			if(marks>100)
				throw new NumberFormatException("MarksOutOfBoundException");
			System.out.println(name+", you obtained "+marks+" marks");
		}
		catch(NumberFormatException e)
		{
			System.out.println(e+": Marks cannot be more than 100");
		}
	}
}
