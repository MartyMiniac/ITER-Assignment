//Write a java code to swap two string variables without using third or temp variable.

import java.util.*;

public class a3q22
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s1=in.nextLine();
		System.out.print("Enter a String : ");
		String s2=in.nextLine();
		in.close();
		if(s1.length()>s2.length())
		{
			for(int i=s2.length(); i<s1.length(); i++)
			{
				s1+=" ";
			}
		}
		else
		{
			for(int i=s1.length(); i<s2.length(); i++)
			{
				s2+=" ";
			}
		}
		
		s1=add(s1,s2);
		s2=subt(s1,s2);
		s1=subt(s1,s2);

		System.out.println("After Swapping");
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
	}
	private static String add(String s1, String s2)
	{
		String outp="";
		for(int i=0; i<s2.length(); i++)
		{
			outp+=(char)((int)s1.charAt(i)+(int)s2.charAt(i));
		}
		return outp;
	}
	private static String subt(String s1, String s2)
	{
		String outp="";
		for(int i=0; i<s2.length(); i++)
		{
			outp+=(char)((int)s1.charAt(i)-(int)s2.charAt(i));
		}
		return outp;
	}
}
