import java.util.*;
class a1q8
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Length of array :");
		int n=in.nextInt();
		int p[] = new int[n];
		int q[] = new int[n];
		int r[] = new int[n];
		for(int a=0; a<p.length; a++)
		{
			System.out.print("p["+a+"]=");
			p[a]=in.nextInt();
		}
		for(int a=0; a<q.length; a++)
		{
			System.out.print("q["+a+"]=");
			q[a]=in.nextInt();
		}
		System.out.println("p[i] X q[i] = r[i]");
		for(int a=0; a<n; a++)
		{
			r[a]=p[a]*q[a];
			System.out.println("r["+a+"]="+r[a]);
		}
	}
}