import java.util.*;
class a8q1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of m :");
		int m=in.nextInt();
		System.out.print("Enter the value of n :");
		int n=in.nextInt();
		int arr[][] = new int[m][n];
		for(int a=0; a<m; a++)
		{
			for(int b=0; b<n; b++)
			{
				System.out.print("arr["+a+"]["+b+"]=");
				arr[a][b]=in.nextInt();
			}
		}
		System.out.println("Printing array ");
		for(int a=0; a<m; a++)
		{
			for(int b=0; b<n; b++)
			{
				System.out.print(arr[a][b]+"\t");
			}
			System.out.println();
		}
	}
}
