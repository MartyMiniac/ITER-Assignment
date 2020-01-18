import java.util.*;
class a8q6
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double n1[][] = new double[3][3];
		double n2[][] = new double[3][3];
		for(int a=0; a<3; a++)
		{
			for(int b=0; b<3; b++)
			{
				System.out.print("n1["+a+"]["+b+"]=");
				n1[a][b]=in.nextDouble();
			}
		}
		for(int a=0; a<3; a++)
		{
			for(int b=0; b<3; b++)
			{
				System.out.print("n2["+a+"]["+b+"]=");
				n2[a][b]=in.nextDouble();
			}
		}
		double arr[][]=addMatrix(n1,n2);
		for(int a=0; a<3; a++)
		{
			for(int b=0; b<3; b++)
			{
				System.out.print(arr[a][b]+"\t");
			}
			System.out.println();
		}
	}
	public static double[][] addMatrix(double a[][], double b[][])
	{
		double arr[][] = new double[a.length][a[0].length];
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				arr[i][j]=a[i][j]+b[i][j];
			}
		}
		return arr;
	}
}
