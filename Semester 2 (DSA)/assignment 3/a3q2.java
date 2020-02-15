import java.util.*;
public class a3q2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String defColor[] = {"Red","Blue", "Green"};
		String arr[] = new String[5];
		System.out.print("Enter the Postion number to add the color :");
		int n=in.nextInt();
		in.nextLine();
		System.out.print("Enter the Color Name : ");
		String color=in.nextLine();
		try
		{
			boolean k=false;
			if(k)
			{
				throw new MyException("Color Not Found");
			}
			arr[n]=color;
			System.out.println("Color Successfully added");
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
class MyException extends Exception
{
	MyException(String s)
	{
		super(s);
	}
}