//Write a java code to find the longest substring without repeating characters in the given string.

import java.util.*;

public class a3q18
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String inp=in.nextLine();
		in.close();
		String biggest="";
		
		for(int i=0; i<inp.length(); i++)
		{
			for(int j=i+1; j<=inp.length(); j++)
			{
				biggest=repeat(inp.substring(i,j))?inp.substring(i,j).length()>biggest.length()?inp.substring(i,j):biggest:biggest;
			}
		}
		System.out.println("Output : "+biggest);
	}
	private static boolean repeat(String inp)
	{
		inp+=" ";
		for(int i=0; i<inp.length(); i++)
		{
			if(inp.split(inp.charAt(i)+"").length>2)
			{
				return false;
			}
		}
		return true;
	}
}
