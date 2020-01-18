import java.util.*;
class a6q14
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Password :");
		String s=in.nextLine();
		if(password(s))
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}
	public static boolean password(String s)
	{
		s=s.toUpperCase();
		boolean k=false;
		int d=0;
		for(int a=0; a<s.length(); a++)
		{
			char ch=s.charAt(a);
			if(ch>=48 && ch<=57)
				d++;
			if((ch>=48 && ch<=57) || (ch>=65 && ch<=90))
				k=true;
			else
			{
				k=false;
				break;
			}
		}
		if(d>=2 && k && s.length()>=8)
			return true;
		else
			return false;
	}
}
