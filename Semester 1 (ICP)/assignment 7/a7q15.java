import java.util.*;
class a7q15
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length of array :");
		int n=in.nextInt();
		int arr[] = new int[n];
		for(int a=0; a<n; a++)
		{
			System.out.print("Enter the value of arr["+a+"] = ");
			arr[a]=in.nextInt();
		}
		int arrn[]=partition(arr);
		for(int a=0; a<arrn.length; a++)
		{
			System.out.print(arrn[a]+"\t");
		}
	}
	public static int[] partition(int arr[])
	{
		int arrt[] = new int[arr.length];
		arrt=arr.clone();
		for(int a=0; a<arrt.length-1; a++)
		{
			int v=arrt[a],l=a;
			for(int b=a+1; b<arrt.length; b++)
			{
				if(arrt[b]<v)
				{
					v=arrt[b];
					l=b;
				}
			}
			int t=arrt[a];
			arrt[a]=arrt[l];
			arrt[l]=t;
		}
		int p=arr[0];
		for(int a=0; a<arrt.length; a++)
		{
			if(p==arrt[a])
			{
				p=a;
				break;
			}
		}
		int t=arr[p];
		arr[p]=arr[0];
		arr[0]=t;
		int n=arr.length;
		for(int a=0; a<p; a++)
		{
			int v=arr[a],l=a;
			for(int b=p+1; b<n; b++)
			{
				if(arr[b]<v)
				{
					v=arr[b];
					l=b;
				}
			}
			t=arr[a];
			arr[a]=arr[l];
			arr[l]=t;
		}
		return arr;
	}
}
