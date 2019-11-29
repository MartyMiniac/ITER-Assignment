import java.util.*;
class a8q3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double arr[][] = new double[4][4];
		for(int a=0; a<4; a++)
		{
			for(int b=0; b<4; b++)
			{
				System.out.print("arr["+a+"]["+b+"]=");
				arr[a][b]=in.nextDouble();
			}
		}
		System.out.println("Sum of the elements in the major diagonal is "+sumMajorDiagonal(arr));
	}
	public static double sumMajorDiagonal(double m[][])
	{
		double s=0;
		int l=m[0].length;
		for(int a=0; a<l; a++)
		{
			s=s+m[a][a];
		}
		return s;
	}
}
