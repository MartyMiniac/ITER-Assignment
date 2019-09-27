import java.util.*;
class a2q10
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double x1,x2,x3,y1,y2,y3,s,a,l1,l2,l3;
		System.out.print("Enter the Value of X1 :");
		x1=in.nextDouble();
		System.out.print("Enter the Value of Y1 :");
		y1=in.nextDouble();
		System.out.print("Enter the Value of X2 :");
		x2=in.nextDouble();
		System.out.print("Enter the Value of Y2 :");
		y2=in.nextDouble();
		System.out.print("Enter the Value of X3 :");
		x3=in.nextDouble();
		System.out.print("Enter the Value of Y3 :");
		y3=in.nextDouble();
		l1=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		l2=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		l3=Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		s=l1+l2+l3;
		s=s/2.0;
		a=Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
		System.out.println("Area of Triangle is "+a);
	}
}