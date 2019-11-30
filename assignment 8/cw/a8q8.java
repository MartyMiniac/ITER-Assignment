import java.util.*;
class a8q8
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("enter the value of n:");
		int n=in.nextInt();
		boolean arr[][] = new boolean[n][n];
		for(int a=0; a<n; a++)
		{
			for(int b=0; b<n; b++)
			{
				if(gcd(a,b)==1)
					arr[a][b]=true;
				else
					arr[a][b]=false;
			}
		}
		for(int a=0; a<n; a++)
		{
			for(int b=0; b<n; b++)
			{
				System.out.print(arr[a][b]+"\t");
			}
			System.out.println();
		}
	}
	public static int gcd(int n1, int n2)
	{
		for(int a=Math.min(n1, n2); a>=1; a--)
		{
			if(n1%a==0 && n2%a==0)
				return a;
		}
		return 1;
	}
}
