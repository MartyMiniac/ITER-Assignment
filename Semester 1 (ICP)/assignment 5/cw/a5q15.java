import java.util.*;
class a5q15
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Savings Amount :");
		double p=in.nextDouble();
		System.out.print("Enter the Annual Intrest Rate :");
		double i=in.nextDouble();
		i=i/100.0;
		i=i/12.0;
		System.out.print("Enter the Number of Months :");
		int n=in.nextInt();
		double f=0;
		for(int a=1; a<=n; a++)
		{
			f=p*(1+i)+f;
		}
		System.out.println("You have Earned "+f);
	}
}
