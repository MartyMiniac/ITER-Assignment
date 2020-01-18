import java.util.*;
class a7q4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Ten Numbers :");
		double n[] = new double[10];
		for(int a=0; a<10; a++)
		{
			System.out.print("n["+a+"]=");
			n[a]=in.nextDouble();
		}
		System.out.println("Smallest Number is the array ="+min(n));
	}
	public static double min(double array[])
	{
		double t=array[0];
		for(int a=1; a<10; a++)
		{
			if(t>array[a])
				t=array[a];
		}
		return t;
	}
}
