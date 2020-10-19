/*Write a Java program to find longest Palindromic Substring within a string 
Example: The given string is: thequickbrownfoxxofnworbquickthe 
The longest palindrome substring in the given string is; 
brownfoxxofnworb The length of the palindromic substring is: 16*/

import java.util.*;

public class a3q13
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=in.nextLine();
		String pal="";
		in.close();
		
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+2; j<s.length(); j++)
			{
				String tmp=s.substring(i,j);
				a3q13 ob = new a3q13();
				if(ob.checkPalindrome(tmp))
					pal=tmp.length()>pal.length()?tmp:pal;
			}
		}
		
		System.out.println("Largest Palidromic String is : "+pal);
	}
	boolean checkPalindrome(String s)
	{
		for(int i=0; i<s.length()/2; i++)
		{
			if(s.charAt(i)!=s.charAt((s.length()-1)-i))
			{
				return false;
			}
		}
		return true;
	}
}
