/*
 * A checksum is a numeric quantity representing and confirming the contents of a file.
 * Write a program which reads a string from the user and find its checksum.
*/

import java.util.*;

public class prog6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=in.nextLine();
		int checksum=0;
		for(char ch:s.toCharArray())
		{
			checksum+=(int)ch;
		}
		System.out.println("Checksum Value = "+checksum);
	}
}
