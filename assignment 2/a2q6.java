import java.util.Scanner;
class a2q6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Weight in pounds : ");
		double p=in.nextDouble();
		System.out.print("Enter height in inches : ");
		double i=in.nextDouble();
		double m=i*0.0254;
		double k=p*0.45359237;
		double bmi=k/(m*m);
		System.out.println(bmi);
	}
}