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
				throw new MarksOutOfBoundException("Marks cannot be more than 100");
			System.out.println(name+", you obtained "+marks+" marks");
		}
		catch(MarksOutOfBoundException e)
		{
			System.out.println(e);
		}
	}
}
class MarksOutOfBoundException extends Exception
{
	MarksOutOfBoundException(String s)
	{
		super(s);
	}
}
