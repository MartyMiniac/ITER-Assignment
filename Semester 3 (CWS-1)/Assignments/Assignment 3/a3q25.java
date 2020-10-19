/*Write an program to print all permutations of a given String in Java. For example,
 * if given input is "123" then your program should print all 6 permutations 
e.g. "123”, “132", "213”, “231", "312” and “321”.*/

import java.util.*;

public class a3q25
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=in.nextLine();
		in.close();
		a3q25 ob = new a3q25();
		Vector<Character> charr=new Vector<Character>();
		for(char ch:s.toCharArray())
		{
			charr.add(ch);
		}
		ob.rec("", charr);
	}
	private void rec(String s, Vector<Character> arr)
	{
		if(arr.size()==1)
		{
			System.out.println(s+arr.get(0));
			return;
		}
		else
		{
			for(int i=0; i<arr.size(); i++)
			{
				Vector<Character> arrn = new Vector<Character>(arr);
				arrn.remove(i);
				rec(s+arr.get(i),arrn);
			}
		}
	}
}
