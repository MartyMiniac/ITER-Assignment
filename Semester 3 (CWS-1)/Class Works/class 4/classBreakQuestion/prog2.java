//Write a program using java to read a string and find number of words present in that string

package classBreakQuestion;

import java.util.Scanner;
import java.util.StringTokenizer;

public class prog2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = in.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		
		System.out.println("Number of Words = "+st.countTokens());
	}
}
