import java.util.*;
class a3q15
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter X : ");
		double x=in.nextDouble();
		System.out.print("Enter Y : ");
		double y=in.nextDouble();
		double c=x*x+y*y-100;
		if(c<0)
			System.out.print("("+x+","+y+") is inside the circle");
		else if(c==0)
			System.out.print("("+x+","+y+") is on the circle");
		else
			System.out.print("("+x+","+y+") is outside the circle");
	}
}