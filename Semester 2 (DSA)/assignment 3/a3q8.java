import java.util.*;
public class a3q8
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("We will be Calculating a^n");
		System.out.print("Enter the value of a :");
		int a=in.nextInt();
		System.out.print("Enter the value of n :");
		int n=in.nextInt();
		int p=pow(a,n);
		System.out.print("Answer = "+p);
	}
	public static int pow(int a, int n)
	{
		if(n<=1)
			return a;
		else
			return a*pow(a,n-1);
	}
}
