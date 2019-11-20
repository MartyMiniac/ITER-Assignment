import java.util.*;
class a7q6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Length of the Array :");
		int n=in.nextInt();
		int arr[] = new int[n];
		for(int a=0; a<n; a++)
		{
			System.out.print("arr["+a+"]=");
			arr[a]=in.nextInt();
		}
		System.out.println("Original Array ");
		for(int a=0; a<n; a++)
		{
			System.out.print(arr[a]+"\t");
		}
		System.out.println();
		for(int a=0; a<(n/2); a++)
		{
			int t=arr[a];
			arr[a]=arr[n-1-a];
			arr[n-1-a]=t;
		}
		System.out.println("Array after Reversal");
		for(int a=0; a<n; a++)
		{
			System.out.print(arr[a]+"\t");
		}
		System.out.println();
	}
}
