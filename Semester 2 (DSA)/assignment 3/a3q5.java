import java.util.*;
public class a3q5
{
	public static <E>void printArray(E[] inputArray)
	{
		for(E var: inputArray)
		{
			System.out.println(var);
		}
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Size of array :");
		int n=in.nextInt();
		Integer arr[] = new Integer[n];
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter for postion number "+i+" :");
			arr[i]=in.nextInt();
		}
		System.out.println("Displaying Elements of the Array ");
		a3q5.<Integer>printArray(arr);
	}
}