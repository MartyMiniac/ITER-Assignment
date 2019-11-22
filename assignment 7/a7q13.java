import java.util.*;
class a7q13
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Number of Elements in the Array :");
		int n=in.nextInt();
		System.out.println("Enter the Values in the Array :");
		int arr[] = new int[n];
		for(int a=0; a<n; a++)
		{
			arr[a]=in.nextInt();
		}
		if(isSorted(arr))
		{
			System.out.println("The list is Sorted");
		}
		else
		{
			System.out.println("The list is not Sorted");
		}
	}
	public static boolean isSorted(int list[])
	{
		for(int a=0; a<list.length-1; a++)
		{
			if(list[a]>list[a+1])
				return false;
		}
		return true;
	}
}
