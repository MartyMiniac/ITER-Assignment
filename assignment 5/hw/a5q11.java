import java.util.*;
class a5q11
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value of n :");
		int n=in.nextInt();
		int ct=0,a=0,b=1,c=1;
		System.out.println(a+"\n"+b+"\n"+c);
		for(int i=2; i<n; i++,ct++)
		{
			int t=a+b+c;
			a=b;
			b=c;
			c=t;
			System.out.println(c);
		}
	}
}
