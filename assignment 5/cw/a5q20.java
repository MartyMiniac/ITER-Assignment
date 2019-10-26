import java.util.*;
class a5q20
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int n=in.nextInt();
		int f=2;
		while(n>1)
		{
			if(n%f==0)
			{
				System.out.print(f+", ");
				n/=f;
			}
			else
			{
				f++;
			}
		}
	}
}
