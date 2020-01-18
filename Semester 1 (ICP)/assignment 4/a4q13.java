import java.util.*;
class a4q13
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number :");
		int i=in.nextInt();
		System.out.println("Digits of the number are :");
		int a=i,s=0;
		while(a>0)
		{
			int t=a%10;
			System.out.println(t);
			a=a/10;
			s=s+t;
		}
		if(s%9==0)
			System.out.print(i+" is divisible by 9");
		else
			System.out.print(i+" is not divisible by 9");
	}
}
