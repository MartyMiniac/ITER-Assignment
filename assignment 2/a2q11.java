import java.util.*;
class a2q11
{
	public static void main(String args[])
	{
		double ia, air, av,mir;
		int noy;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter investment  amount :");
		ia=in.nextDouble();
		System.out.print("Enter annual interest rate in percentage :");
		air=in.nextDouble();
		System.out.print("Enter number of years :");
		noy=in.nextInt();
		mir=air/1200.0;
		av=ia*Math.pow((mir+1),noy*12);
		System.out.println("Accumulated value is $"+av);
	}
}