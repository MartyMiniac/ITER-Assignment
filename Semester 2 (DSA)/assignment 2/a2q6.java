import java.util.*;
class a2q6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the side of Square : ");
		double s=in.nextDouble();
		Shape ob = null;
		ob = new Square();
		double ans=ob.area(s,0);
		System.out.println("Area of Square : "+ans);
		System.out.print("Enter the radius of Circle : ");
		s=in.nextDouble();
		ob = new Circle();
		ans=ob.area(s,0);
		System.out.println("Area of Circle : "+ans);
		System.out.print("Enter the base length of Triangle : ");
		s=in.nextDouble();
		System.out.print("Enter the height length of Triangle : ");
		double t=in.nextDouble();
		ob = new Triangle();
		ans=ob.area(s,t);
		System.out.println("Area of Triangle : "+ans);
	}
}
abstract class Shape
{
	public abstract double area(double a, double b);
}
class Square extends Shape
{
	public double area(double a, double b)
	{
		return a*a;
	}
}
class Triangle extends Shape
{
	public double area(double a, double b)
	{
		return 0.5*a*b;
	}
}
class Circle extends Shape
{
	public double area(double a, double b)
	{
		return Math.PI*a*a;
	}
}
