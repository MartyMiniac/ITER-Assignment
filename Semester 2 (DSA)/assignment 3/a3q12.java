import java.util.*;
public class a3q12 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int n=in.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements in the array in accending order :");
		for(int i=0; i<n; i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.print("Enter the element to be searched :");
		int e=in.nextInt();
		int s=search(arr,e,n/2);
		System.out.print("Element found at "+s);
	}
	public static int search(int[] arr, int e, int m)
	{
		if(e==arr[m])
			return m;
		else
		{
			if(e>arr[m])
			{
				return search(arr, e, m+m/2);
			}
			else
			{
				return search(arr, e, m-m/2);
			}
		}
	}
}
