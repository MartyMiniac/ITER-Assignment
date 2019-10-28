import java.util.*;
class a5q17
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value of n :");
		int n=in.nextInt();
		int ans=0;
		for(int a=2; a<=n; a++)
		{
			if(n%a==0)
			{
				ans=a;
				break;
			}
		}
		System.out.println("Lowest Perfect Divisior of "+n+" = "+ans);
	}
}
