import java.util.*;
class a6q13
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the String :");
		String s=in.nextLine();
		if(palindrome(s))
			System.out.println("The String is pallindrome");
		else
			System.out.println("The String is not pallindrome");
	}
	public static boolean palindrome(String s)
	{
		int n=s.length()-1;
		boolean k=false;
		for(int a=0; a<n/2; a++)
		{
			if(s.charAt(a)==s.charAt(n-a))
				k=true;
			else
			{
				k=false;
				break;
			}
		}
		return k;
	}
}
