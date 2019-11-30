import java.util.*;
class a8q9
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double arr1[][] = new double[3][3];
		double arr2[][] = new double[3][3];
		for(int a=0; a<3; a++)
		{
			for(int b=0; b<3; b++)
			{
				System.out.print("arr1["+a+"]["+b+"]=");
				arr1[a][b]=in.nextDouble();
			}
		}
		for(int a=0; a<3; a++)
		{
			for(int b=0; b<3; b++)
			{
				System.out.print("arr2["+a+"]["+b+"]=");
				arr2[a][b]=in.nextDouble();
			}
		}
		double prod[][]=multiplyMatrix(arr1, arr2);
		for(int a=0; a<3; a++)
		{
			for(int b=0; b<3; b++)
			{
				System.out.print(arr1[a][b]+"\t");
			}
			System.out.print("\t");
			if(a==1)
				System.out.print("*");
			else
				System.out.print(" ");
			System.out.print("\t");
			for(int b=0; b<3; b++)
			{
				System.out.print(arr2[a][b]+"\t");
			}
			System.out.print("\t");
			if(a==1)
				System.out.print("=");
			else
				System.out.print(" ");
			System.out.print("\t");
			for(int b=0; b<3; b++)
			{
				System.out.print(prod[a][b]+"\t");
			}
			System.out.println();
		}
	}
	public static double[][] multiplyMatrix(double arr1[][], double arr2[][])
	{
		double prod[][] = new double[arr1[0].length][arr1[0].length];
		for(int a=0; a<prod.length; a++)
		{
			for(int b=0; b<prod[0].length; b++)
			{
				double s=0;
				for(int c=0; c<prod[0].length; c++)
				{
					s=s+arr1[c][a]*arr2[a][c];
				}
				prod[a][b]=s;
			}
		}
		return prod;
	}
}
