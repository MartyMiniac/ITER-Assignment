import java.util.*;
public class a3q2
{
	public static void main(String args[])
	{
		a3q2 ob = new a3q2();
		Scanner in = new Scanner(System.in);
		String arr[] = new String[5];
		System.out.print("Enter the Postion number to add the color :");
		int n=in.nextInt();
		in.nextLine();
		System.out.print("Enter the Color Name : ");
		String color=in.nextLine();
		try
		{
			arr[n]=color;
			System.out.println("Color Successfully added");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
