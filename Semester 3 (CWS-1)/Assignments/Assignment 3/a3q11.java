/*Design and write a Java program that searches for single- digit numbers in a text 
and changes them to their corresponding words. For ex- ample, the string 
“4 score and 7 years ago” would be converted into "four score and seven years ago”.*/

import java.util.*;

public class a3q11
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Stirng : ");
		String inp=in.nextLine();
		in.close();
		String numbers[]= {"zero", 
							"one",
							"two",
							"three",
							"four",
							"five",
							"six",
							"seven",
							"eight",
							"nine",};
		StringTokenizer st = new StringTokenizer(inp," ");
		while(st.hasMoreElements())
		{
			String tmp=st.nextToken();
			try
			{
				int i=Integer.parseInt(tmp);
				System.out.print(numbers[i]+" ");
			}
			catch(NumberFormatException e)
			{
				System.out.print(tmp+" ");
			}
		}
	}
}
