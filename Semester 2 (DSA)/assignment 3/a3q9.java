import java.util.*;
public class a3q9 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n=in.nextInt();
		int r=rev(n);
		System.out.print(r);
	}
	public static int rev(int n)
	{
		if(n<10)
			return n;
		else
		{
			int m=(int)(Math.log(n)/Math.log(10));
			int r=n%10;
			r=r*(int)Math.pow(10, m);
			n=n/10;
			return r+rev(n);
		}
	}
}
