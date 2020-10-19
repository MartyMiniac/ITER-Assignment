/*Write a java program to remove the title from a name. 
Ex. Input: Mr. Sachin Tendulkar Ms. Saina Nehwal Output: Sachin Tendulkar Saina Nehwal 
*/

import java.util.*;

public class a3q15
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=in.nextLine();
		in.close();
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreElements())
		{
			String tmp=st.nextToken();
			if(tmp.equalsIgnoreCase("Mr."))
			{
				continue;
			}
			System.out.print(tmp+" ");
		}
	}
}
