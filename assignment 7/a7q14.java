import java.util.*;
class a7q14
{
	public static void main(String args[])
	{
		long st=System.currentTimeMillis();
		int arr[] = new int[100];
		//Adding Random Numbers to the Array
		for(int a=0; a<100; a++)
		{
			arr[a]=(int)(Math.random()*2147483647);
		}
		//Getting a random number present in the array by generating a random number and then getting the value of array at that position number
		int key=(int)(Math.random()*100);
		key=arr[key];
		//sorting
		for(int a=0; a<99; a++)
		{
			for(int b=0; b<99-a; b++)
			{
				if(arr[a]>arr[a+1])
				{
					int t=arr[a];
					arr[a]=arr[a+1];
					arr[a+1]=t;
				}
			}
		}
		//linear search
		for(int a=0; a<100; a++)
		{
			if(arr[a]==key)
			{
				System.out.println("Key found at position number "+a+" with value = "+arr[a]);
				break;
			}
		}
		long et=System.currentTimeMillis();
		System.out.println("Time Taken for Linear Search "+(et-st));


		st=System.currentTimeMillis();
		//Adding Random Numbers to the Array
		int arrn[] = new int[100];
		for(int a=0; a<100; a++)
		{
			arrn[a]=(int)(Math.random()*2147483647);
		}
		//Getting a random number present in the array by generating a random number and then getting the value of array at that position number
		key=(int)(Math.random()*100);
		key=arrn[key];
		//sorting
		for(int a=0; a<99; a++)
		{
			for(int b=0; b<(99-a); b++)
			{
				if(arrn[a]>arrn[a+1])
				{
					int t=arrn[a];
					arrn[a]=arrn[a+1];
					arrn[a+1]=t;
				}
			}
		}
		//binary search
		int f = 0, l = arrn.length-1, m = (f+l)/2;
		while(f <= l)
		{
			if(arrn[m] < key)
			{
			   f = m+1;
			}
			else if(arrn[m] == key)
			{
			   System.out.println(key+ " Found at Location " +m);
			   break;
			}
			else
			{
			   l = m - 1;
			}
			m = (f+l)/2;
		}
       		if(f > l)
       		{
			System.out.println("Not Found..!! " +key+ " is not Present in the List.");
       		}
		et=System.currentTimeMillis();
		System.out.println("Time Taken for Binary Search "+(et-st));
	}
}
