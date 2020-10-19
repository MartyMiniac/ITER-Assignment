//Write a program to check whether the entered string is palindrome or not

import java.util.*;

public class a3q8
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String s=in.nextLine();
		in.close();
		
		a3q8 ob = new a3q8();
		if(ob.checkPalindrome(s))
		{
			System.out.println(s+" is palindrome");
		}
		else
		{
			System.out.println(s+" is not palindrome string");
		}
	}
	boolean checkPalindrome(String s)
	{
		if(s.length()<2)
			return true;
		else
		{
			char ch1=s.charAt(0);
			char ch2=s.charAt(s.length()-1);
			if(ch1!=ch2)
				return false;
			s=s.substring(0,1);
			s=s.substring(s.length()-1, s.length());
			checkPalindrome(s);
		}
		return true;
	}
}
