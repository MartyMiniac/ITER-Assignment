import java.util.*;
class a6q1
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the First Number :");
		int a=in.nextInt();
		System.out.print("Enter the Second Number :");
		int b=in.nextInt();
		System.out.print("Enter\n1 for add\n2 for subtract\n3 for multiplication\n4 for divistion\n5 for finding remainder\n6 for finding root\nYour Choice=> ");
		int c=in.nextInt();
		switch(c)
		{
			case 1:
				System.out.println(additionSimple(a,b));
				break;
			case 2:
				System.out.println(subtractionSimple(a,b));
				break;
			case 3:
				System.out.println(multiplicationSimple(a,b));
				break;
			case 4:
				System.out.println(divisionSimple(a,b));
				break;
			case 5:
				System.out.println(remainderSimple(a,b));
				break;
			case 6:
				System.out.println(squareRootSimple(a));
				break;
		}
	}
	public static int additionSimple(int x,int y)
	{
		return x+y;
	}
	public static int subtractionSimple(int x,int y)
	{
		return x-y;
	}
	public static int multiplicationSimple(int x,int y)
	{
		return x*y;
	}
	public static double divisionSimple(int x,int y)
	{
		if(x!=0)
			return (double)y/(double)x;
		else
			return 0;
	}
	public static int remainderSimple(int n, int m)
	{
		return n%m;
	}
	public static double squareRootSimple(int n)
	{
		if(n<0)
		{
			System.out.println("Entered value is negative hence its squareroot is not possible");
			return 0;
		}
		else
		{
			return Math.sqrt(n);
		}
	}
}
