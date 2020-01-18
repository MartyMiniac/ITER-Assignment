import java.util.*;
class a5q16
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of digits :");
		int n=in.nextInt();
		String s="";
		System.out.println("Start Entering the Digits");
		for(int a=0; a<n; a++)
		{
			int inp=in.nextInt();
			s=s+inp;
		}
		n=Integer.parseInt(s);
		System.out.println("Entered Number ="+n);
	}
}
