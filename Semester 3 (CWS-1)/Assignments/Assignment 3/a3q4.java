//Write a program to enter a string and count the frequency each character present in it.

import java.util.*;

public class a3q4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=in.nextLine();
		in.close();
		int arr[] = new int[256];
		s.toUpperCase();
		for(char ch:s.toCharArray())
		{
			arr[ch]++;
		}
		for(int i=0; i<256; i++)
		{
			if(arr[i]!=0)
			System.out.println("\'"+((char)i)+"\' occured "+arr[i]+" times");
		}
	}
}
