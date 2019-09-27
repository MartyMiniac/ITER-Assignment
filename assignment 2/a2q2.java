import java.util.*;
class a2q2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius :" );
		double r,l,a,v;
		r=in.nextDouble();
		System.out.print("Enter the length :" );
		l=in.nextDouble();
		a=r*r*Math.PI;
		v=a*l;
		System.out.println("The area is "+a+"\nThe Volume is "+v);
	}
}