//Write a java code to remove all occurrences of a given character from an input String

import java.util.*;

public class a3q17
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String inp=in.nextLine();
		System.out.print("Enter a character to be removed : ");
		char ch=in.nextLine().charAt(0);
		in.close();
		
		String out=inp.replaceAll(ch+"", "");
		
		System.out.println("Output : "+out);
	}
}
