import java.util.*;
class a1q6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Length of array :");
		int n=in.nextInt();
		int arr[] = new int[n];
		for(int a=0; a<arr.length; a++)
		{
			System.out.print("arr["+a+"]=");
			arr[a]=in.nextInt();
		}
		a1q6 ob = new a1q6();
		System.out.println("Largest Element is "+ob.largest(arr));
		System.out.println("Smallest Element is "+ob.smallest(arr));
	}
	public int largest(int arr[])
	{
		int n=arr[0];
		for(int a=1; a<arr.length; a++)
		{
			if(n<arr[a])
			{
				n=arr[a];
			}
		}
		return n;
	}
	public int smallest(int arr[])
	{
		int n=arr[0];
		for(int a=1; a<arr.length; a++)
		{
			if(n>arr[a])
			{
				n=arr[a];
			}
		}
		return n;		
	}
}