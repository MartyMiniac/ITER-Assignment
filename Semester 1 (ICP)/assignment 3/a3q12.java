import java.util.Scanner;
class a3q12
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 Integers ");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int t=a+b+c-Math.max(Math.max(a, b),Math.max(b,c))-Math.min(Math.min(a, b),Math.min(b, c));
		System.out.print(Math.min(Math.min(a, b),Math.min(b, c))+","+t+","+Math.max(Math.max(a, b),Math.max(b,c)));
	}
}