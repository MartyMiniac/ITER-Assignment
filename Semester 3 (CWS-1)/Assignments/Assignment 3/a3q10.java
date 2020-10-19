/*The global replace function is a string-processing algorithm found in every word 
processor. Write a method that takes three String arguments: a document,
a target string, and a replacement string. The method should replace every
occurrence of the target string in the document with the re- placement string.
For example, if the document is “ To be or not to be, that is the question,” and
the target string is “be”, and the replacement string is “see,” the result should be,
“To see or not to see, that is the question."*/

import java.util.*;

public class a3q10
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str=in.nextLine();
		System.out.print("Enter the targetted word : ");
		String tar=in.nextLine();
		System.out.print("Enter the replacement word : ");
		String rep=in.nextLine();
		in.close();
		replace(str, tar,rep);
	}
	public static void replace(String str, String tar, String rep)
	{
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreElements())
		{
			String tmp=(String) st.nextElement();
			if(tmp.equalsIgnoreCase(tar))
			{
				System.out.print(rep+" ");
			}
			else
			{
				System.out.print(tmp+" ");
			}
		}
	}
}
