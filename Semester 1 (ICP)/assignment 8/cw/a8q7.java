import java.util.*;
class a8q7
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of side length :");
		int m=in.nextInt();
		int n=m;
		int arr[][] = new int[m][m];
		System.out.println("Enter the values in the matrix");
		for(int a=0; a<m; a++)
		{
			for(int b=0; b<n; b++)
			{
				System.out.print("arr["+a+"]["+b+"]=");
				arr[a][b]=in.nextInt();
			}
		}
		System.out.println("Before Transposing");
		for(int a=0; a<m; a++)
		{
			for(int b=0; b<n; b++)
			{
				System.out.print(arr[a][b]+"\t");
			}
			System.out.println();
		}
		for(int a=0; a<m; a++)
		{
			for(int b=a; b<n; b++)
			{
				int t=arr[a][b];
				arr[a][b]=arr[b][a];
				arr[b][a]=t;
			}
		}
		System.out.println("After Transposing");
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
