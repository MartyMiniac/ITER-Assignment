import java.util.*;
class a6q12
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the String :");
		String s=in.nextLine();
		System.out.println("Number of Vowels in "+s+" is "+count(s));
	}
	public static int count(String s)
	{
		s=s.toLowerCase();
		s=s.trim();
		int c=0;
		for(int a=0; a<s.length(); a++)
		{
			char ch=s.charAt(a);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				c++;
		}
		return c;
	}
}
