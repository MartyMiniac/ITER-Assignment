/*Write a program to enter a string and print the string in a format which says 
that 1st letter of each word present in the string must be printed in capital letters.*/

import java.util.*;

public class a3q5
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=in.nextLine();
		in.close();
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreElements())
		{
			String tmp=(String) st.nextElement();
			System.out.print(tmp.toString().toUpperCase().charAt(0)+tmp.substring(1)+" ");
		}
	}
}
