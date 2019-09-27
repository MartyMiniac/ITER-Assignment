import java.util.Scanner;
class a2q9
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter x1 and y1 : ");
		double x1=in.nextDouble(),y1=in.nextDouble();
		System.out.print("Enter x2 and y2 : ");
		double x2=in.nextDouble(),y2=in.nextDouble();
		double d=Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1),2));
		System.out.print("The distance between the two points is "+d);
	}
}