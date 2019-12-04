//a9q3.java
import java.util.*;
class QuadraticEquation
{
	private double a, b, c;
	QuadraticEquation(double i, double j, double k)
	{
		a=i;
		b=j;
		c=k;
	}
	double getDiscriminant()
	{
		return b*b-4*a*c;
	}
	double geta()
	{
		return a;
	}
	double getb()
	{
		return b;
	}
	double getc()
	{
		return c;
	}
	double getRoot1()
	{
		double r = -b+Math.sqrt(getDiscriminant());
		r=r/(2*a);
		return r;
	}
	double getRoot2()
	{
		double r = -b-Math.sqrt(getDiscriminant());
		r=r/(2*a);
		return r;
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value of a :");
		double i=in.nextDouble();
		System.out.print("Enter the Value of b :");
		double j=in.nextDouble();
		System.out.print("Enter the Value of c :");
		double k=in.nextDouble();
		QuadraticEquation ob = new QuadraticEquation(i,j,k);
		double d=ob.getDiscriminant();
		if(d>0)
		{
			System.out.println("Root 1 ="+ob.getRoot1());
			System.out.println("Root 2 ="+ob.getRoot2());
		}
		else if(d==0)
		{
			System.out.println("Roots are same and equal to = "+ob.getRoot1());
		}
		else
		{
			System.out.println("Imaginary Roots ");
		}
	}
}

