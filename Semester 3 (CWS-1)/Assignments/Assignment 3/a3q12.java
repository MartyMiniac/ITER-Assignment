/*Write a method that converts its String parameter so that letters are written in 
blocks five characters long. For example, consider the following two versions of 
the same sentence: Plain : This i s how we would o r d in a rily write a sentence.
Blocked : This i showw ewoul dordi n a r il ywrit easen tence.*/

import java.util.*;

public class a3q12
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String inp=in.nextLine();
		in.close();
		a3q12 ob = new a3q12();
		ob.block(inp);
	}
	private void block(String inp)
	{
		inp=inp.replaceAll(" ", "");
		for(int i=0; i<inp.length(); i++)
		{
			if(i%5==0 && i!=0)
			{
				System.out.print(" ");
			}
			System.out.print(inp.charAt(i));
		}
	}
}
