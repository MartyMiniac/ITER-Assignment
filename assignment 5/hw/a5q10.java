import java.util.*;
class a5q10
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of n :");
		int n=in.nextInt();
		int a=2,b=1;
		System.out.print(a+"\t"+b);
		for(int i=2; i<=n; i++)
		{
			int t=b;
			b=a+b;
			a=t;
			System.out.print("\t"+b);
		}
	}
}
