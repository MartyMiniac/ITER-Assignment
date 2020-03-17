import java.util.*;
public class a3q11
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first value :");
		int m=in.nextInt();
		System.out.print("Enter the second value :");
		int n=in.nextInt();
		int ans=gcd(m,n);
		System.out.println(ans);
	}
	public static int gcd(int m, int n)
	{
		if(Math.max(m, n)%Math.min(m, n)==0)
			return Math.min(m, n);
		else
			return gcd(Math.min(m,n),Math.max(m, n)%Math.min(m, n));
	}
}