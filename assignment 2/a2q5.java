import java.util.Scanner;
class a2q5
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter v0, v1 and t : ");
		double v0=in.nextDouble(),v1=in.nextDouble(),t=in.nextDouble();
		double a=(v1-v0)/t;
		System.out.print("The average accelaration is "+a);
	}
}