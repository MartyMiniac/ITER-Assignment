import java.util.*;
class a5q14
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value of n :");
		int n=in.nextInt();
		long t1=0l,t2=1l;
		System.out.println(t1);
		for(int a=1; a<=n; a++)
		{
			long t=t2;
			t2=t1+t2;
			t1=t;
			System.out.println(t1);
		}
	}
}
