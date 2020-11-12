/*
Write a program to extract maximum numeric value from a given string.
For example: this is “There is 60 students in csed section, 40 in cseb, and
55 in csea” input string and output is 60.
*/
import java.util.*;
import java.util.regex.*;
public class prog4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=in.nextLine();
		in.close();
		Pattern p = Pattern.compile("\\-?\\d+");
		Matcher m = p.matcher(s);
		int max=Integer.MIN_VALUE;
		while(m.find())
		{
			max=Math.max(max, Integer.parseInt(s.substring(m.start(), m.end())));
		}
		System.out.print("Max number is the String is : "+max);
	}
}
