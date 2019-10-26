import java.util.*;
class a5q8
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the First Number :");
		int n1=in.nextInt();
		System.out.print("Enter the Second Number :");
		int n2=in.nextInt();
		int sg=0;
		if((n1>0 && n2>0) || (n1<0 && n2<0))
		{
			sg=1;
		}
		else
		{
			sg=-1;
		}
		int ans=0;
		for(int a=1; a<=Math.abs(n2); a++)
		{
			ans=ans+Math.abs(n1);
		}
		ans=sg*ans;
		System.out.println(n1+"X"+n2+"="+ans);
	}
}
