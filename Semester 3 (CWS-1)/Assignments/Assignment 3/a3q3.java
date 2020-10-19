//Write a program to enter a string and count how many vowels present in it.

import java.util.*;

public class a3q3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=in.nextLine();
		in.close();
		str=" "+str.toLowerCase()+" ";
		StringTokenizer st = new StringTokenizer(str,"aeiou");
		System.out.println("Number of Vowels : "+(st.countTokens()-1));
	}
}
