import java.util.*;
class a5q6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number of numbers :");
		int n=in.nextInt();
		double s=0;
		for(int a=1; a<=n; a++)
		{
			System.out.print("Enter the Term Number "+a+" : ");
			double t=in.nextDouble();
			s=s+(1/t);
		}
		s=1/s;
		s=s*n;
		System.out.println("Harmoric Mean :"+s);
	}
}

