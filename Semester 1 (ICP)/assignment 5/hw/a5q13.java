import java.util.*;
class a5q13
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of n :");
		int n=in.nextInt();
		for(int a=0; a<=n; a++)
		{

			int f=1,s=0;
			for(int b=1; b<=a; b++)
			{
				f=f*b;
			}
			s=s+f;
			for(int b=1; b<=(a+1); b++)
			{
				f=f*b;
			}
			s=s+f;
			System.out.println(s);
		}
	}
}
