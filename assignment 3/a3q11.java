import java.util.Scanner;
class a3q11
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Weight : ");
		double w=in.nextDouble();
		System.out.print("Enter height : ");
		double h=in.nextDouble();
		double bmi=w/(h*h);
		if(bmi<18.5)
			System.out.print("Underweight");
		else if(bmi<24.9)
			System.out.print("Normal Weight");
		else if(bmi<29.9)
			System.out.print("Overweight");
		else
			System.out.print("Obese");
	}
}