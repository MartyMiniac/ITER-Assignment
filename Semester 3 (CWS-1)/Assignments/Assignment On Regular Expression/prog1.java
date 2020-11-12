//Write a program in Java to remove whitespaces from a string.
import java.util.*;
import java.util.regex.*;
public class prog1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=in.nextLine();
		in.close();
		Pattern p = Pattern.compile("\\b\\w+\\b");
		Matcher m = p.matcher(s);
		while(m.find())
		{
			System.out.print(s.substring(m.start(),m.end()));
		}
	}
}
