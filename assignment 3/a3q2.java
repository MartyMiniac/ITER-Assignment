import java.util.Scanner;
class a3q2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the marks in your Exam :");
		double m=in.nextDouble();
		if(m>=40)
		{
			System.out.print("Congratulation! you passed the Exam");
		}
		else
			System.out.print("Sorry, You Failed the Exam");
	}
}