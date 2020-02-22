import java.util.*;
class a3q1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Lucky Number :");
		int i=in.nextInt();
		try
		{
			if(i<0)
			{
				throw new NumberFormatException("NumberFormatException");
			}
			System.out.println("Your Lucky Number is "+i);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Not That Lucky !! Seems you encounter an Exception !!");
			System.out.println(e);
		}
	}
}
