import java.util.*;
class a5q19
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the First Number :");
		int a=in.nextInt();
		System.out.print("Enter the Second Number :");
		int b=in.nextInt();
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
		System.out.println(ans);
	}
}
