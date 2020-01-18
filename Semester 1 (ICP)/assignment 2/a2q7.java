import java.util.*;
class a2q7
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the side : ");
		double s=in.nextDouble();
		double a=3*Math.sqrt(3)*s*s*0.5;
		System.out.print("The area of the hexagon is "+a);
	}
}