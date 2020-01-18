import java.util.*;
class a5q2
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number of Students :");
		int n=in.nextInt();
		int c=0;
		for(int a=0; a<n; a++)
		{
			System.out.print("Enter Marks : ");
			int m=in.nextInt();
			if(m>=40)
				c++;
		}
		System.out.print(c+" has passed the Exam");
	}
}
