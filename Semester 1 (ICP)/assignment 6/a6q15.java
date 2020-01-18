import java.util.*;
class a6q15
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		a6q15 ob = new a6q15();
		System.out.print("Whose area do you want to find out\n1 for triangle\n2 for square\n3 for circle\n4 for rectangle\nYour Choice : ");
		int n=in.nextInt();
		switch(n)
		{
			case 1:
				System.out.println("Enter Base and Height :");
				System.out.println("Area of triangle = "+ob.area(in.nextInt(),in.nextInt()));
			break;
			case 2:
				System.out.print("Enter Side Length :");
				System.out.println("Area of Square = "+ob.area(in.nextInt()));
			break;
			case 3:
				System.out.print("Enter Circle radius :");
				System.out.println("Area of Circle = "+ob.area(in.nextDouble()));
			break;
			case 4:
				System.out.println("Enter Lenght and Breath :");
				System.out.println("Area of Rectangle = "+ob.area(in.nextDouble(),in.nextDouble()));
			break;
			default:
				System.out.println("Invalid option");
		}
	}
	public double area(int b, int h)
	{
		return 0.5*b*h;
	}
	public double area(int s)
	{
		return s*s;
	}
	public double area(double r)
	{
		return Math.PI*r*r;
	}
	public double area(double l, double b)
	{
		return l*b;
	}
}
