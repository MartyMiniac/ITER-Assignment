import java.util.*;
class a5q16
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n=in.nextInt();
		int f=0;
		while(n>0)
		{
			f=f*10+n%10;
			n=n/10;
		}
		System.out.println("Reversed Number : "+f);
	}
}
