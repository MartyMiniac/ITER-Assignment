import java.util.*;
class a5q5
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value of n :");
		int n=in.nextInt();
		double s=0;
		System.out.println("Enter The Values :");
		for(int a=0; a<n; a++)
		{
			int t=in.nextInt();
			s=s+t;
		}
		System.out.println("Sum ="+s);
		s=s/(double)n;
		System.out.println("Average ="+s);
	}
}
