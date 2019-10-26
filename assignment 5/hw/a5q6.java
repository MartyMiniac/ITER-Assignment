import java.util.*;
class a5q6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Number :");
		int n=in.nextInt();
		int f=1,a=1;
		boolean k=false;
		while(f<n)
		{
			f*=a;
			if(f==n)
			{
				k=true;
				break;
			}
			a++;
		}
		if(k)
		{
			System.out.println(n+" is a factorial number");
		}
		else
		{
			System.out.println(n+" is a non factorial number");
		}
	}
}
