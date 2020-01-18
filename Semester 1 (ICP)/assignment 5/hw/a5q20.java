import java.util.*;
class a5q20
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first number :");
		int n1=in.nextInt();
		System.out.print("Enter the second number :");
		int n2=in.nextInt();
		int a=n1;
		int b=n2;
		int ans=0;
		if (a==0)
       		ans=b;
    		while (b!=0)
    		{
	        	if (a>b)
	           	a=a-b;
	        	else
	           	b=b-a;
	    		ans=a;
	    	}
	    ans=n1*n2/ans;
		System.out.println(ans);
	}
}
