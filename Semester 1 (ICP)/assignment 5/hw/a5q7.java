import java.util.*;
class a5q7
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int n=in.nextInt();
		int f=1,a=1;
		boolean k=false;
		while(f<=n)
		{
			a++;
			f*=a;
		}
		f/=a;
		System.out.println("Largest possible factorial ="+f);
	}
}
