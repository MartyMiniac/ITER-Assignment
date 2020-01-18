import java.util.Scanner;
class a3q6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a,b,c,d,e,f");
		double a=in.nextDouble();
		double b=in.nextDouble();
		double c=in.nextDouble();
		double d=in.nextDouble();
		double e=in.nextDouble();
		double f=in.nextDouble();
		double t=a*d-b*c;
		if(t==0)
			System.out.print("Equation has no solution");
		else
		{
			double x=(e*d-b*f)/t;
			double y=(a*f-e*c)/t;
			System.out.print("x="+x+"\ny="+y);
		}
	}
}