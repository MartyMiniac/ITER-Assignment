//Write a java program to read two string as user input and check if first contains second?

import java.util.*;

public class a3q16
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the First String : ");
		String s1=in.nextLine();
		System.out.print("Enter the String String : ");
		String s2=in.nextLine();
		in.close();
		
		if(s1.contains(s2))
		{
			System.out.println("Yes, 1st string contains the second");
		}
		else
		{
			System.out.println("No, 1st string doesn't contains the second");
		}
	}
}
