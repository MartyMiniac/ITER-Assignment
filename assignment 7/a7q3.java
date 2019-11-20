import java.util.*;
class a7q3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int arr[] = new int[10];
		for(int a=0; a<10; a++)
		{
			System.out.print("arr["+a+"]=");
			arr[a]=in.nextInt();
		}
		int c=0; 
		System.out.print("Enter the Number to Find :");
		int f=in.nextInt();
		for(int a=0; a<10; a++)
		{
			if(arr[a]==f)
			{
				c++;
			}
		}
		if(c!=0)
		{
			System.out.println(f+" is found "+c+" times");
		}
		else
		{
			System.out.println(f+" is not found");
		}
	}
}
