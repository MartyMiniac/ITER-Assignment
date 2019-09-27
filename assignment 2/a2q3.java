import java.util.Scanner;
class a2q3
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a value for feet : ");
		double f=in.nextDouble();
		double m=f*0.305;
		System.out.println(f+" feet is "+m+" meters");
	}
}