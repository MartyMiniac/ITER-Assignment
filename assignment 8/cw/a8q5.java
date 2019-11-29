import java.util.*;
class a8q5
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of m :");
		int m=in.nextInt();
		System.out.print("Enter the value of n :");
		int n=in.nextInt();
		int arr[][] = new int[m+1][n+2];
		for(int a=0; a<m; a++)
		{
			for(int b=0; b<n; b++)
			{
				arr[a][b]=in.nextInt();
			}
		}
		for(int a=0; a<m; a++)
		{
			int s=0;
			for(int b=0; b<n; b++)
			{
				s=s+arr[a][b];
			}
			s=s/n;
			arr[a][n]=s;
		}
		for(int b=0; b<n; b++)
		{
			int s=0;
			for(int a=0; a<m; a++)
			{
				s=s+arr[a][b];
			}
			s=s/m;
			arr[m][b]=s;
		}
		for(int a=0; a<=m; a++)
		{
			for(int b=0; b<=n; b++)
			{
				System.out.print(arr[a][b]+"\t");
			}
			System.out.println();
		}
	}
}
