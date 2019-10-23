import java.util.*;
class a5q12
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value x : ");
		double x=in.nextDouble();
		double ans=0;
		for(int n=0; n<=20; n++)
		{
			double f=1;
			for(int a=1; a<=n; a++)
			{
				f=f*a;
			}
			ans=ans+Math.pow(x,n)/f;
		}
		System.out.println("e^"+x+"="+ans);
	}
}
