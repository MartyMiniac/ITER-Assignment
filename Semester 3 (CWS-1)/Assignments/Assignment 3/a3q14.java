/*Write a Java program to find first non repeating character in a string . 
Example: The given string is: gibblegabbler 
The first non repeated character in String is: i*/

import java.util.*;

public class a3q14
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String inp=in.nextLine();
		inp+=" ";
		in.close();
		
		for(int i=0; i<inp.length(); i++)
		{
			char ch=inp.charAt(i);
			if(inp.split(ch+"").length==2)
			{
				System.out.println(ch+" is First Non repeated Character in the string");
				System.exit(0);
			}
		}
		System.err.println("There doesn't Exist any character that is not repeated in the string");
	}
}
