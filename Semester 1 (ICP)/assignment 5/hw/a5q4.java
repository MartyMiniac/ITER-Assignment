import java.util.*;
class a5q4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value of n :");
		int n=in.nextInt();
		int t=1;
		for(int a=1; a<=n; a++)
		{
			System.out.print(t+"\t");
			t=t*-1;
		}
	}
}
