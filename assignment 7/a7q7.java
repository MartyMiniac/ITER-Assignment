import java.util.*;
class a7q7
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the decimal number :");
		String s=Integer.toOctalString(in.nextInt());
		System.out.println("Octal Value of the entered number is "+s);
	}
}
