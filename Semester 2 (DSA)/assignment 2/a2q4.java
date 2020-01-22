import java.util.*;
public class a2q4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		CircleType ob = new CircleType();
		System.out.println("Enter center of Circle (First x, Then y) : ");
		double x=in.nextDouble();
		double y=in.nextDouble();
		System.out.print("Enter radius of Circle : ");
		double r=in.nextDouble();
		ob.setCentre(x, y);
		ob.setRadius(r);
		ob.showPoint();
		ob.printCoordinates();
		ob.printRadius();
		ob.printArea();
		ob.printCircumference();
	}
}
class PointType
{
	double x, y;
	PointType()
	{
		x=0;
		y=0;
	}
	void setx(double x)
	{
		this.x=x;
	}
	void sety(double y)
	{
		this.y=y;
	}
	void showPoint()
	{
		if(x>=0)
		{
			if(y>=0)
			{
				System.out.println("The Point is in First Quadrant");
			}
			else
			{
				System.out.println("The Point is in Fourth Quadrant");
			}
		}
		else
		{
			if(y>=0)
			{
				System.out.println("The Point is in Second Quadrant");
			}
			else
			{
				System.out.println("The Point is in Third Quadrant");
			}
		}
	}
	void printCoordinates()
	{
		System.out.println("("+x+","+y+")");
	}
	double getx()
	{
		return x;
	}	
	double gety()
	{
		return y;
	}
}
class CircleType extends PointType
{
	double radius;
	CircleType()
	{
		radius=0;
	}
	void setRadius(double radius)
	{
		this.radius=radius;
	}
	void setCentre(double x, double y)
	{
		setx(x);
		sety(y);		
	}
	void printRadius()
	{
		System.out.println("Radius of Circle = "+radius);
	}
	void printArea()
	{
		double a=Math.PI*radius*radius;
		System.out.println("Area of Circle = "+a);
	}
	void printCircumference()
	{
		double c=2*Math.PI*radius;
		System.out.println("Circumference of Circle = "+c);
	}
}