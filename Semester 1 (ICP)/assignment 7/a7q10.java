import java.util.*;
class a7q10
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter ten numbers :");
		int arr[] = new int[10];
		for(int a=0; a<10; a++)
		{
			arr[a]=in.nextInt();
		}
		int arrn[]=eliminateDuplicates(arr);
		System.out.println("The distict numbers are :");
		for(int a=0; a<arrn.length; a++)
		{
			System.out.print(arrn[a]+"\t");
		}
		System.out.println();
	}
	public static int[] eliminateDuplicates(int list[])
	{
		boolean k[] = new boolean[10];
		for(int a=0; a<10; a++)
		{
			k[a]=true;
		}
		for(int a=0; a<9; a++)
		{
			for(int b=a+1; b<10; b++)
			{
				if(list[a]==list[b])
				{
					k[b]=false;
				}
			}
		}
		int c=0;
		for(int a=0; a<10; a++)
		{
			if(k[a])
				c++;
		}
		int rt[] = new int[c];
		int b=0;
		for(int a=0; a<10; a++)
		{
			if(k[a])
			{
				rt[b]=list[a];
				b++;
			}
		}
		return rt;
	}
}
