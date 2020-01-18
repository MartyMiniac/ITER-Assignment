import java.util.*;
class a5q2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value of n :");
		int n=in.nextInt();
		int s=0;
		for(int a=1; a<=n; a++)
		{
			s=s+a*a;
		}
		System.out.println("Sum ="+s);
	}
}
