import java.util.*;
class a7q11
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 10 numbers :");
		double arr[] = new double[10];
		for(int a=0; a<10; a++)
		{
			arr[a]=in.nextDouble();
		}
		System.out.println("After Sorting :");
		double arrn[]=bubbleSort(arr);
		for(int a=0; a<10; a++)
		{
			System.out.println(arrn[a]);
		}
	}
	public static double[] bubbleSort(double arr[])
	{
		for(int a=0; a<9; a++)
		{
			for(int b=1; b<(9-a); b++)
			{
				if(arr[b]>arr[b+1])
				{
					double t=arr[b];
					arr[b]=arr[b+1];
					arr[b+1]=t;
				}
			}
		}
		return arr;
	}
}
