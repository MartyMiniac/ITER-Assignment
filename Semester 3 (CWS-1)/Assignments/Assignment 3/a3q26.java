/*Write a Java program which will take a String input and print out a number of 
vowels and consonants on that String. For example, if the input is “Java” then 
your program should print "2 vowels and 2 consonants”.*/

import java.util.*;

public class a3q26
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String s=in.nextLine();
		in.close();
		int cons=0, vowel=0;
		for(char ch:s.toLowerCase().toCharArray())
		{
			if(Character.isLetter(ch))
			{
				switch(ch)
				{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vowel++;
					break;
				default:
					cons++;
				}
			}
		}
		System.out.println("Number of Vowels : "+vowel);
		System.out.println("Number of Consonants : "+cons);
	}
}
