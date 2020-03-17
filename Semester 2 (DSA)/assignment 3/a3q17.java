import java.util.*;
public class a3q17
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int n=in.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the Elements in the array :");
		for(int i=0; i<n; i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.print("Enter the pivot element :");
		int p=in.nextInt();
		int p1=0, p2=n-1;
		int[] s=quicksort(arr, p, p1, p2);
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static int[] quicksort(int arr[], int p, int p1, int p2 ) 
	{
		if(p1<p2)
		{ 
			if(arr[p1]<p) 
				p1++; 
			else
			{
				if(arr[p2]>p) 
					p2--; 
				else if(arr[p1]==arr[p2]) 
					p1++; 
				else 
				{ 
					int t=arr[p1]; 
					arr[p1]=arr[p2]; 
					arr[p2]=t; 
				}
			}
			return quicksort(arr,p,p1,p2); 
		}
		else
			return arr;
	} 
}