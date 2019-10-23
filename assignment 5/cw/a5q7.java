import java.util.*;
class a5q7
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value of n :");
		int n=in.nextInt();
		int s=0;
		for(int a=1; a<=n ; a++)
		{
			int t=2*a-1;
			if(a%2==0)
			{
				s=s-t;
			}
			else
			{
				s=s+t;
			}
		}
		System.out.println("Sum ="+s);
	}
}
