import java.util.*;
public class a3q7 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number to determine the factorial of :");
		int n=in.nextInt();
		long f=fact(n);
		System.out.println(f);
	}
	public static long fact(long n)
	{
		if(n<=1)
			return 1;
		else
			return n*fact(n-1);
	}
}
