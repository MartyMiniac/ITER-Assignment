import java.util.*;
class a6q11
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the String :");
		String s=in.nextLine();
		System.out.print("Enter the character to find the occurance :");
		char ch=in.next().charAt(0);
		System.out.println("No of occurance of "+ch+" in "+s+" is "+count(s,ch));
	}
	public static int count(String str, char a)
	{
		int c=0;
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch==a)
				c++;
		}
		return c;
	}
}
