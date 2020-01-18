import java.util.*;
class a5q21
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the First Number :");
		int n1=in.nextInt();
		System.out.print("Enter the Second Number :");
		int n2=in.nextInt();
		int f=1,t=1;
		while(t<=Math.min(n1,n2))
		{
			if(n1%t==0 && n2%t==0)
			{
				f=t;
			}
			t++;
		}
		System.out.println("GCD of "+n1+" and "+n2+" is "+f);
	}
}
