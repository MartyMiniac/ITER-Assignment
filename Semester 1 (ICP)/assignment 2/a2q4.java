import java.util.Scanner;
class a2q4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Number between 0 and 1000 : ");
		int a=in.nextInt();
		int b=a,s=0;
		if(a<1000)
		{
			while(b>0)
			{
				s=s+b%10;
				b=b/10;
			}
			System.out.print("The sum of the digits is "+s);
		}
		else
		{
			System.out.println(a+" is more than 1000");
		}
	}
}