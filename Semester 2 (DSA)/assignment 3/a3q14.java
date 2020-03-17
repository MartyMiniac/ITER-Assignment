import java.util.Scanner;
public class a3q14
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first number :");
		int a=in.nextInt();
		System.out.print("Enter the second number :");
		int b=in.nextInt();
		int ans=mul(a,b);
		System.out.println(ans);
	}
	public static int mul(int a, int b)
	{
		if(b>0)
			return a+mul(a,b-1);
		else if(b<0)
			return mul(a,b+1)-a;
		else
			return 0;
	}
}