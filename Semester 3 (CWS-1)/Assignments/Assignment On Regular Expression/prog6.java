//Write a program to get the first letter of each word in a string using regex in Java.
import java.util.*;
import java.util.regex.*;
public class prog6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=in.nextLine();
		s=" "+s;
		in.close();
		Pattern p = Pattern.compile("\\s");
		Matcher m =p.matcher(s);
		while(m.find())
		{
			System.out.print(s.charAt(m.start()+1));
		}
	}
}
