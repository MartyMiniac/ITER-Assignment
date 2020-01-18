import java.util.*;
class a7q5
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
		for(int a=0; a<(n-1); a++)
		{
			for(int b=0; b<(n-a-1); b++)
			{
				if(arr[b]>arr[b+1])
				{
					int t=arr[b];
					arr[b]=arr[b+1];
					arr[b+1]=t;
				}
			}
		}
		System.out.println("Second smallest Number in the array ="+arr[1]);
	}
}
