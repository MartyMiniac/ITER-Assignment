//Write a java program to input a string from user and reverse each word of the string.

import java.util.*;

public class a3q20
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String inp=in.nextLine();
		in.close();
		
		StringTokenizer st = new StringTokenizer(inp);
		while(st.hasMoreElements())
		{
			System.out.print(rev(st.nextToken())+" ");
		}
	}
	private static String rev(String s)
	{
		String rt="";
		for(int i=s.length()-1; i>-1; i--)
		{
			rt+=s.charAt(i);
		}
		return rt;
	}
}
