import java.util.*;
class a5q11
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value x : ");
		double x=in.nextDouble();
		double ans=0;
		int n=0;
		while(true)
		{
			int t=2*n;
			double f=1;
			for(int a=1; a<=t; a++)
			{
				f=f*a;
			}
			if((Math.pow(x,t)/f)<Math.pow(10,-6))
			break;
			if(n%2==0)
			ans=ans+Math.pow(x,t)/f;
			else
			ans=ans-Math.pow(x,t)/f;
			n++;
		}
		System.out.println("cos("+x+")="+ans);
	}
}
