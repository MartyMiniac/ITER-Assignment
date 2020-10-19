/*Write a function to implement an algorithm which will accept a string of characters 
 * and should find the highest occurrence of the character and display it.
 * For example if input is “aaaaaaaaaaaaaaaaabbbbcddddeeeeee” it should return “a”.*/

import java.util.*;

public class a3q29
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String inp=in.nextLine();
		in.close();
		
		int count=0;
		char character=' ';
		for(int i=0; i<inp.length(); i++)
		{
			char ch=inp.charAt(i);
			int t=0;
			for(;i<inp.length(); i++)
			{
				if(ch==inp.charAt(i))
				{
					t++;
				}
				else
				{
					i--;
					break;
				}
			}
			if(t>count)
			{
				count=Math.max(count, t);
				character=ch;
			}
		}
		System.out.print("\'"+character+"\' Was repeated the most");
	}
}
