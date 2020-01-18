import java.util.*;
class a7q9
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Values :");
		double arr[] = new double[10];
		for(int a=0; a<10; a++)
		{
			arr[a]=in.nextDouble();
		}
		System.out.println("Mean ="+mean(arr));
		System.out.println("Deviation ="+deviation(arr));
	}
	public static double mean(double x[])
	{
		double s=0;
		for(int a=0; a<10; a++)
		{
			s=s+x[a];
		}
		return s/10;
	}
	public static double deviation(double x[])
	{
		double m=mean(x);
		double d=0;
		for(int a=0; a<10; a++)
		{
			d=d+(x[a]-m)*(x[a]-m);
		}
		d=d/9;
		d=Math.sqrt(d);
		return d;
	}
}

