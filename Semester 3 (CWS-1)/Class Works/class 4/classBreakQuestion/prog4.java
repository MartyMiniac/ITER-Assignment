/*Write a program which read a string from user 
 *and remove all token form the string and create
 *an output string which consist of string without
 *any token of the input string.
*/

package classBreakQuestion;

import java.util.Scanner; 
import java.util.StringTokenizer;

public class prog4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s = in.nextLine();
		System.out.print("Enter the Token : ");
		String token = in.nextLine();
		StringTokenizer st = new StringTokenizer(s,token);

		StringBuilder sb = new StringBuilder();
		while(st.hasMoreElements())
		{
			sb.append(st.nextToken());
		}
		System.out.println(sb);
	}
}
