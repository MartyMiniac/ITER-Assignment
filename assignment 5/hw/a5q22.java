import java.util.*;
import java.math.*;
class a5q22
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of n :");
		String nt=in.nextLine();
		System.out.print("Enter the value of x :");
		int x=in.nextInt();
		BigInteger n = new BigInteger(nt);
		for(int a=1; a<x; a++)
		{
			n=n.multiply(BigInteger.valueOf(Integer.parseInt(nt)));
		}
		System.out.println("n^x="+n);
	}
}
