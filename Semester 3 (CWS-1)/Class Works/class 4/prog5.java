//Write a Program that reads a string and process it if consecutive delimiters are present then ignore it else print the token.

import java.util.Scanner;
import java.util.StringTokenizer;

public class prog5
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = in.nextLine();
		System.out.print("Enter the Delimiter : ");
		String d=in.nextLine();
		
		StringTokenizer st = new StringTokenizer(s,d);
		
		while(st.hasMoreTokens())
		{
			System.out.print(st.nextToken());
		}
	}
}
