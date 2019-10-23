import java.util.*;
class a5q11
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value x : ");
		double x=in.nextDouble();
		double ans=0;
		for(int n=0; n<=20; n++)
		{
			int t=2*n;
			double f=1;
			for(int a=1; a<=t; a++)
			{
				f=f*a;
			}
			if(n%2==0)
			ans=ans+Math.pow(x,t)/f;
			else
			ans=ans-Math.pow(x,t)/f;
		}
		System.out.println("cos("+x+")="+ans);
	}
}
