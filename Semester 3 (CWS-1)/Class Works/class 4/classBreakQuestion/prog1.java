/*Write a Program which reads 2 strings from user and concat the substring from 0 to 5 index of 
first string with 0 to 7 index of the second string and print the resultant string.*/

package classBreakQuestion;

import java.util.*;

public class prog1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the First String : ");
		String s1=in.nextLine();
		
		System.out.print("Enter the Second String : ");
		String s2=in.nextLine();
		
		String s3=s1.substring(0,5)+s2.substring(0,7);
		
		System.out.println("Final String : "+s3);
	}
}
