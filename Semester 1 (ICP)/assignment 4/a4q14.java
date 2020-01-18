import java.util.*;
class a4q14
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the value of n :");
		int n=in.nextInt();
		double o=0, a=-1;
		while(true)
		{
			o=a;
			a++;
			if(Math.pow(2,a)>n)
				break;
			if(Math.pow(2,a)==n)
			{
				o=a;
				break;
			}
		}
		o=Math.pow(2,o);
		System.out.println("Answer = "+o);
	}
}
