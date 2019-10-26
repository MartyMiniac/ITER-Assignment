import java.util.*;
class a5q3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of n :");
		int n=in.nextInt();
		for(int a=0; a<=n; a++)
		{
			System.out.print((int)Math.pow(2,a)+"\t");
		}
	}
}
