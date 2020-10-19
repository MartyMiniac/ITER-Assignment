/*Write a program to enter a name as string and print the name in shorter manner. 
Ex: Ram Chandra Dash will become R.C.Dash 
*/

import java.util.*;

public class a3q7
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=in.nextLine();
		in.close();
		StringTokenizer st = new StringTokenizer(s," ");
		int cnt=st.countTokens();
		while(st.hasMoreElements())
		{
			String tmp=(String) st.nextElement();
			System.out.print(tmp.toString().toUpperCase().charAt(0)+".");
			cnt--;
			if(cnt==1)
				break;
		}
		if(st.hasMoreElements())
		{
			String tmp=st.nextToken();
			System.out.print(tmp.toString().toUpperCase().charAt(0)+tmp.substring(1));
		}
	}
}
