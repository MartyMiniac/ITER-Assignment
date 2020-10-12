//Write a program to read a string words are separated by ‘,’ find the number of words and number of ‘,’ present in that string.

package classBreakQuestion;

import java.util.Scanner; 
import java.util.StringTokenizer;

public class prog3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = in.nextLine()+" ";
		StringTokenizer st = new StringTokenizer(s,",");

		System.out.println("Number of Words seperated by \',\'= "+(st.countTokens()-1));
		System.out.println("Number of \',\'= "+(st.countTokens()-1));
	}
}
