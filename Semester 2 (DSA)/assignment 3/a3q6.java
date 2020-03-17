import java.util.*;
public class a3q6 
{
	public static <T>int count(T[] array, T item)
	{
		int c=0;
		for(T var:array)
		{
			c=(var.equals(item))?c+1:c;
		}
		return c;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int n=0;
		System.out.print("Enter the size of the Array :");
		n=in.nextInt();
		Integer arr[] = new Integer[n];
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter for position "+i+" :");
			arr[i]=in.nextInt();
		}
		System.out.print("Enter the Element to count :");
		Integer e = new Integer(in.nextInt());
		int c=a3q6.<Integer>count(arr,e);
		System.out.println(c);
		}
}
