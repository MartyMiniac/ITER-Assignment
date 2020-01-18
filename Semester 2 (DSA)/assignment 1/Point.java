//a1q11
import java.util.*;
public class Point 
{
	int x, y;
	Point()
	{
		x=0;
		y=0;
	}
	public void setPoint()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Value of x :");
		x=in.nextInt();
		System.out.print("Enter the Value of y :");
		y=in.nextInt();
	}
	public void findDistance(Point ob1, Point ob2)
	{
		int x1=ob1.x;
		int y1=ob1.y;
		int x2=ob2.x;
		int y2=ob2.y;
		double d=(x2-x1)*(x2-x1)+(y2-y2)*(y2-y1);
		d=Math.sqrt(d);
		System.out.println("Distance between the points = "+d);
	}
	public static void main(String args[])
	{
		Point ob1 = new Point();
		Point ob2 = new Point();
		Point ob = new Point();
		ob1.setPoint();
		ob2.setPoint();
		ob.findDistance(ob1,  ob2);
	}
}
