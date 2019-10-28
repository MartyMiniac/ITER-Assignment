import java.util.*;
class a5q12
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of d :");
		int d=in.nextInt();
		System.out.print("Enter the value of e :");
		int e=in.nextInt();
		int a=0,b=1;
		while(a<=d)
		{
			int t=a+b;
			a=b;
			b=t;
		}
		if(b==Math.max(d,e) && e==Math.min(d,e))
			System.out.println(d+","+e+" is a part of fibonacci series ");
		else
			System.out.println(d+","+e+" is not a part of fibonacci series");
	}
}
