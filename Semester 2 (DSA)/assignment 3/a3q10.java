import java.util.*;
public class a3q10
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the element of fibonacii :");
		int n=in.nextInt();
		int ans=fibo(0,1,n);
		System.out.print(ans);
	}
	public static int fibo(int a, int b, int n)
	{
		if(n<=1)
			return a;
		else
			return fibo(b, a+b, n-1);
	}
}
