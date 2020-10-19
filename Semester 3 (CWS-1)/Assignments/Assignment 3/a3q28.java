/*Write a function to search for the existence of a string (target) in another string 
(source). The function takes two strings as the input and returns the index where the
second string is found. If the target string cannot be found, then return -1. 
If you are a Java developer, then you can relate its behavior to indexOf() method from 
java.lang.String class. This question is also asked as Code and algorithm to check if a 
given short string is a substring of the main string. Can you get a linear solution (O(n)) if possible? */

import java.util.*;

public class a3q28
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=in.nextLine();
		System.out.print("Enter the String to be Searched : ");
		String s=in.nextLine();
		in.close();
		a3q28 ob = new a3q28();
		int outp=0;
		if((outp=ob.searchString(str,s))==-1)
		{
			System.out.println("Substring not found in the main String");
		}
		else
		{
			System.out.println("Substring found at Postion number "+outp);
		}
	}
	private int searchString(String str, String s)
	{
		for(int i=0; i<=str.length()-s.length(); i++)
		{
			String tmp=str.substring(i,i+s.length());
			if(s.equals(tmp))
			{
				return i;
			}
		}
		return -1;
	}
}
