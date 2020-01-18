import java.util.*;
class a4q10
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a no. fow which you want to find the multiplication table :");
		int i=in.nextInt();
		for(int a=1; a<=10; a++)
		{
			System.out.println(i+"x"+a+"="+(i*a));
		}
	}
}
