//Write a java code to move all uppercase characters to the end of string.

import java.util.*;

public class a3q23
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String inp=in.nextLine();
		in.close();
		StringBuffer sb = new StringBuffer(inp);
		int len=inp.length();
		for(int i=0; i<len; i++)
		{
			char ch=sb.charAt(i);
			if(Character.isUpperCase(ch))
			{
				sb.deleteCharAt(i);
				sb.append(ch);
				i--;
				len--;
			}
		}
		System.out.println("Output : "+sb);
	}
}
