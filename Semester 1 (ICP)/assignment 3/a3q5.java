import java.util.Scanner;
class a3q5
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Equation is ax^2+bx+c=0\na :");
		double a=in.nextDouble();
		System.out.print("b :");
		double b=in.nextDouble();
		System.out.print("c :");
		double c=in.nextDouble();
		double d=b*b-4*a*c;
		if(d==0)
			System.out.print("Root is ="+(-b/2.0*a));
		else if(d>0)
		{
			double r1, r2;
			d=Math.sqrt(d);
			r1=-b+d;
			r1=r1/2.0*a;
			r2=-b-d;
			r2=r2/2.0*a;
			System.out.print("roots are \n"+r1+"\n"+r2);
		}
		else
			System.out.print("Roots are imaginary");
	}
}