import java.util.Scanner;
class a1q7
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Length of array :");
		int n=in.nextInt();
		int arr[] = new int[n];
		for(int a=0; a<arr.length; a++)
		{
			System.out.print("arr["+a+"]=");
			arr[a]=in.nextInt();
		}
		a1q7 ob = new a1q7();
		ob.findOddPair(arr);
	}
	public void findOddPair(int arr[])
	{
		for(int a=0; a<arr.length-1; a++)
		{
			for(int b=a; b<arr.length; b++)
			{
				if(isOdd(arr[a]*arr[b]))
				{
					System.out.println(arr[a]+" , "+arr[b]);
				}
			}
		}
	}
	public boolean isOdd(int i)
	{
		return i%2==1;
	}
}