import java.util.*;
class a5q5
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value of n :");
		double n=in.nextInt();
		int f=1;
		for(int a=1; a<=n; a++)
		{
			f=f*a;
		}
		n=1.0/f;
		System.out.println("1/n! ="+n);
	}
}
