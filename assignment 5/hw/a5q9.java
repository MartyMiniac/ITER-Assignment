import java.util.*;
class a5q9
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of n :");
		int n=in.nextInt();
		int s=1;
		for(int a=1; a<=n; a++)
		{
			int t=1;
			for(int b=1; b<=a; b++)
			{
				t=t*b;
			}
			s=s+t;
		}
		System.out.println("sum ="+s);
	}
}
