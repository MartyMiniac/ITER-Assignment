import java.util.*;
class a5q9
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value of x :");
		double x=in.nextDouble();
		System.out.print("Enter the Value of n :");
		double n=in.nextDouble();
		double t=1;
		for(int a=1; a<=n; a++)
		{
			t=t*a;
		}
		n=t;
		x=Math.pow(x,n)/n;
		System.out.println("Answer ="+x);
	}
}
