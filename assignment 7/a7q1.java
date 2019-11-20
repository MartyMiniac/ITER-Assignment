import java.util.*;
class a7q1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Size of Array :");
		int n=in.nextInt();
		double r[] = new double[n];
		for(int a=0; a<n; a++)
		{
			r[a]=Math.random();
		}
		System.out.println("Values Stored in Array ");
		for(int a=0; a<n; a++)
		{
			System.out.println(r[a]);
		}
		double s=0;
		for(int a=0; a<n; a++)
		{
			s=s+r[a];
		}
		System.out.println("Sum ="+s);
		System.out.println("Average ="+(s/n));
	}
}
