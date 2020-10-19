/*Write a method that takes a delimited string to store a name and address, from 
which you can print a mailing label. For example, if the string contains “Sam Penn:14 Bridge St.:Hoboken, NJ 01881,”
the method should print the label shown in the below: Sam Penn 14 Bridge St. Hoboken, NJ 01881*/

import java.util.*;

public class a3q9
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter mail label : ");
		String s=in.nextLine();
		in.close();
		StringTokenizer st = new StringTokenizer(s,":,");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement().toString().trim());
		}
	}
}
