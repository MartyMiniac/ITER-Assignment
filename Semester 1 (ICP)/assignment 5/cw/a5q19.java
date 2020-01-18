import java.util.*;
class a5q19
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n=in.nextInt();
		String s="";
		while(n>0)
		{
			int t=n%2;
			n/=2;
			s=t+s;
		}
		System.out.println(s);
	}
}
