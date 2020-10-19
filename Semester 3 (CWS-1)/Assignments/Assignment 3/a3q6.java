/*Write a program to enter N number of strings , arrange them in ascending order.*/

import java.util.*;

public class a3q6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the Value of n : ");
		int n=in.nextInt();
		in.nextLine();
		
		String arr[]=new String[n];
		for(int i=0; i<n; i++)
		{
			System.out.print((i+1)+" : ");
			arr[i]=in.nextLine();
		}
		in.close();
		
		a3q6 ob = new a3q6();
		arr=ob.sort(arr);
		
		System.out.println("Strings After Sorting : ");
		for(String s:arr)
		{
			System.out.println(s);
		}
	}
	String[] sort(String arr[])
	{
		int n = arr.length; 
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++)
            {
                if (arr[j].compareTo(arr[j+1])>0) 
                {  
                    String temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
            }
        }
        return arr;
	}
}
