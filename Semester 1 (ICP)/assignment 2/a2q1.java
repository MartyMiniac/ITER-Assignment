import java.util.*;
class a2q1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter temperature in degree Celsius : ");
		double c=in.nextDouble();
		double f=(9/5.0)*c+32;
		System.out.print(c+" Celsius is "+f+" Fahrenheit");
	}
}