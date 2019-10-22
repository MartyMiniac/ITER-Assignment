import java.util.*;
class a5q1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=in.nextInt();
		for(int a=0; a<=n; a++)
		{
			System.out.println(a+"\t"+(int)Math.pow(2,a));
		}
	}
}
