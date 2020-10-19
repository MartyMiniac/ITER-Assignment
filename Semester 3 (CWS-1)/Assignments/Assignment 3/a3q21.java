//Write a java code to capitalize first alphabet of each word in a string

import java.util.Scanner;
import java.util.StringTokenizer;

public class a3q21
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
			String t=st.nextToken();
			System.out.print(t.toUpperCase().charAt(0)+t.toLowerCase().substring(1)+" ");
		}
	}
}
