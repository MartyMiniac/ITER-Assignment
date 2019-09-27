import java.util.*;
class a4q4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the inital point :");
		int b=in.nextInt();
		System.out.print("Enter the final point :");
		int c=in.nextInt();
		System.out.print("Enter the step :");
		int d=in.nextInt();
		for(int a=b; a<=c; a=a+d)
			System.out.print(a+"\t");
	}
}