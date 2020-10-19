/*Write a Program to sort String on their length in Java? Your method should accept
 * an array of String and return a sorted array based upon the length of String.
*/

import java.util.*;

public class a3q30
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number of Strings to be Entered : ");
		int n=in.nextInt();
		//clears buffer
		in.nextLine();
		
		String arr[] = new String[n];
		for(int i=0; i<n; i++)
		{
			System.out.print("arr["+i+"]=");
			arr[i]=in.nextLine();
		}
		in.close();
		a3q30 ob = new a3q30();
		arr=ob.sort(arr);
		System.out.println("After Sorting");
		for(String s:arr)
		{
			System.out.println(s);
		}
	}
	private String[] sort(String arr[])
	{
		int n = arr.length; 
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j].length()>arr[j+1].length()) 
                { 
                    String temp=arr[j]; 
                    arr[j]=arr[j+1]; 
                    arr[j+1]=temp; 
                }
            }
        }
        return arr;
	}
}
