import java.util.*;
class a8q2
{
	public static void main(String args[])
	{
		double arr[][] = new double[3][4];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the values in array :");
		for(int a=0; a<3; a++)
		{
			for(int b=0; b<4; b++)
			{
				System.out.print("arr["+a+"]["+b+"]=");
				arr[a][b]=in.nextDouble();
			}
		}
		System.out.println("Entered array :");
		for(int a=0; a<3; a++)
		{
			for(int b=0; b<4; b++)
			{
				System.out.print(arr[a][b]+"\t");
			}
			System.out.println();
		}
		for(int b=0; b<4; b++)
		{
			System.out.println("Sum of the elements at column "+b+" is "+sumColumn(arr, b));
		}
	}
	public static double sumColumn(double m[][], int columnIndex)
	{
		double s=0;
		for(int a=0; a<3; a++)
		{
			s=s+m[a][columnIndex];
		}
		return s;
	}
}
