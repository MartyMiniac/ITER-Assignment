import java.util.*;
class a5q8
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value of n :");
		int n=in.nextInt();
		long f=1l;
		for(int a=1; a<=n; a++)
		{
			f=f*a;
		}
		System.out.println(n+"! ="+f);
	}
}
