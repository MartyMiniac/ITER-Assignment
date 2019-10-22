import java.util.*;
class a5q4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		double s=0,c=0;
		while(true)
		{
			System.out.print("Enter an integer, the input ends if it 0 : ");
			int t=in.nextInt();
			s=s+t;
			c++;
			if(t==0)
			{
				c--;
				break;
			}
		}
		System.out.println("The total is "+s);
		s=s/c;
		System.out.println("The average is "+s);
	}
}
