import java.util.*;
class a6q8
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of sides : ");
		int n=in.nextInt();
		System.out.print("Enter the side : ");
		double s=in.nextDouble();
		System.out.println("The are of the polygon is "+area(n,s));
	}
	public static double area(int n, double side)
	{
		return (n*side*side)/(4*Math.tan(Math.PI/(double)n));
	}
}
