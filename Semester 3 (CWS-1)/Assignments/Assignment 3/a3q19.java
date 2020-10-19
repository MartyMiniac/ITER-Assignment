//Write a java program to check if a String contains only digits.

import java.util.*;

public class a3q19
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String inp=in.nextLine();
		in.close();
		
		for(int i=0; i<inp.length(); i++)
		{
			if(Character.isDigit(inp.charAt(i)))
			{
				System.out.println("The Given String Contains a Number");
				System.exit(0);
			}
		}
		System.out.println("The Given String doesn't contain any number");
	}
}
