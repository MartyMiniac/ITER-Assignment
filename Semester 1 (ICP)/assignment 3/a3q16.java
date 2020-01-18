import java.util.*;
class a3q16
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your Marks :");
		double s=in.nextDouble();
		System.out.print("Your Grade is ");
		int m=((int)s/10);
		switch(m)
		{
		case 10:
		case 9:
			System.out.print("O");
			break;
		case 8:
			System.out.print("A");
			break;
		case 7:
			System.out.print("B");
			break;
		case 6:
			System.out.print("C");
			break;
		case 5:
			System.out.print("D");
			break;
		case 4:
			System.out.print("E");
			break;
		default:
			System.out.print("F");
		}
	}
}