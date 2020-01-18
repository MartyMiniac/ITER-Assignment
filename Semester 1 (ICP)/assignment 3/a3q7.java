import java.util.Scanner;
class a3q7
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x,y");
		double x=in.nextDouble();
		double y=in.nextDouble();
		if(x>0 && y>0)
			System.out.print("("+x+","+y+") is in first quadrant");
		if(x<0 && y>0)
			System.out.print("("+x+","+y+") is in second quadrant");
		if(x<0 && y<0)
			System.out.print("("+x+","+y+") is in third quadrant");
		if(x>0 && y<0)
			System.out.print("("+x+","+y+") is in fourth quadrant");
	}
}