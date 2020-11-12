//Write a Java program to read all mobile numbers present in given file and validate it
import java.io.*;
import java.util.*;
import java.util.regex.*;
public class prog2
{
	public static void main(String args[]) throws IOException
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Location of the File : ");
		String floc=in.nextLine();
		in.close();
		BufferedReader br = null;
		try
		{
			FileReader fr = new FileReader(floc);
			br = new BufferedReader(fr);
		}
		catch (FileNotFoundException e)
		{
			System.err.print("Error : File Not Found");
			System.exit(0);
		}
		String t="";
		Pattern p = Pattern.compile("(91[7-9]\\d{9})|(0[7-9]\\d{9})|([7-9]\\d{9})");
		while((t=br.readLine())!=null)
		{
			Matcher m = p.matcher(t);
			System.out.print(t+" is a ");
			if(m.matches())
			{
				System.out.println("valid number");
			}
			else
			{
				System.out.println("invalid number");
			}
		}
	}
}
