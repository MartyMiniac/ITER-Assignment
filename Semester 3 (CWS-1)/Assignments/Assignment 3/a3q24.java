//Write a java code to generate random string of a given size.

import java.util.*;

public class a3q24
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter String Length to Generate : ");
		int n=in.nextInt();
		in.close();
		String out="";
		for(int i=0; i<n; i++)
		{
			switch((int)(Math.random()*2))
			{
			case 0:
				out+=(char)((int)(Math.random()*26+65));
				break;
			case 1:
				out+=(char)((int)(Math.random()*26+97));
				break;
			}
		}
		System.out.println(out);
	}
}
