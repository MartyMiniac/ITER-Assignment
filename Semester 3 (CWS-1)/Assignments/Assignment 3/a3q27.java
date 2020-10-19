/*
 * You are given 3 strings:first, second, and third. Third String is said to be a shuffle 
 * of first and second if it can be formed by interleaving the characters of first and second 
 * String in a way that maintains the left to right ordering of the characters from each string. 
 * For example, given first ="abc"and second ="def”, third ="dabecf” is a valid shuffle since it 
 * preserves the character ordering of the two strings. So, given these 3 strings write a 
 * function that detects whether the third String is a valid shuffle of first and second String.
 */

import java.util.*;

public class a3q27
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the First String : ");
		String s1=in.nextLine();
		System.out.print("Enter the Second String : ");
		String s2=in.nextLine();
		System.out.print("Enter the Shuffled String : ");
		String s3=in.nextLine();
		in.close();
		a3q27 ob = new a3q27();
		if(ob.checkShuffle(s1,s2,s3))
		{
			System.out.println("The Shuffling is Correct");
		}
		else
		{
			System.out.println("The Shuffling is Wrong");
		}
	}
	private boolean checkShuffle(String s1, String s2, String s3)
	{
		StringBuffer sb1 = new StringBuffer(s1);
		StringBuffer sb2 = new StringBuffer(s2);
		if(s1.length()+s2.length()!=s3.length())
		{
			return false;
		}
		for(char ch:s3.toCharArray())
		{
			if(sb1.length()!=0 && ch==sb1.charAt(0))
			{
				sb1.deleteCharAt(0);
			}
			else if(sb2.length()!=0 && ch==sb2.charAt(0))
			{
				sb2.deleteCharAt(0);
			}
			else
			{
				return false;
			}			
		}
		return true;
	}
}
