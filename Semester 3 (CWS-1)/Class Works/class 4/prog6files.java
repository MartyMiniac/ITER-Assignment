/*
 * A checksum is a numeric quantity representing and confirming the contents of a file.
 * Write a program which reads a string file location from the user and find checksum of the file.
*/

import java.io.*;
import java.util.*;

public class prog6files
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the File Location : ");
		String s=in.nextLine();
		try
		{
			FileReader f = new FileReader(s);
			BufferedReader fs = new BufferedReader(f);
			
			int checksum=0;
			while(true)
			{
				String val=fs.readLine();
				if(val==null)
					break;
				for(char ch:val.toCharArray())
				{
					checksum+=ch;
				}
			}
			
			fs.close();
			System.out.println("Checksum Value = "+checksum);
		}
		catch(IOException e)
		{
			System.err.println("Error: File Not Found");
		}
		in.close();
	}
}
