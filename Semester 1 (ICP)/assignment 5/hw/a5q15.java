import java.util.*;
class a5q15
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number :");
		int n=in.nextInt();
		String s=Integer.toString(n);
		int sm=0;
		for(int a=0; a<s.length(); a++)
		{
			char ch=s.charAt(a);
			int t=Integer.parseInt(ch+"");
			sm=sm+t;
		}
		System.out.println("sum of digits ="+sm);
	}
}
