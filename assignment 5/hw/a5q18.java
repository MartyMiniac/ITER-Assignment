import java.util.*;
class a5q18
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value of n :");
		int n =in.nextInt();
		System.out.println("Perfect Divisiors of "+n+" are");
		for(int a=1; a<=n; a++)
		{
			if(n%a==0)
			{
				System.out.println(a);
			}
		}
	}
}
