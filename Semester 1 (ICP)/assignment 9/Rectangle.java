//a9q2.java
public class Rectangle
{
	double width, height;
	public static void main(String args[])
	{
		Rectangle ob1 = new Rectangle(4,40);
		Rectangle ob2 = new Rectangle(3.5,35.9);
		System.out.println("Area = "+ob1.getArea());
		System.out.println("Perimeter ="+ob1.getPerimeter());
		System.out.println("Area ="+ob2.getArea());
		System.out.println("Perimeter ="+ob2.getPerimeter());
	}
	Rectangle()
	{
		width=1;
		height=1;
	}
	Rectangle(double a, double b)
	{
		width=a;
		height=b;
	}
	double getArea()
	{
		return width*height;
	}
	double getPerimeter()
	{
		return 0.5*(width+height);
	}
}
