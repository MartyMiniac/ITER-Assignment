package mypack1;
import java.util.*;
public class Test extends Student
{
	public int mark1, mark2;
	public void input()
	{
		Scanner in = new Scanner(System.in);
		super.input();
		System.out.print("Enter the Mark 1 :");
		mark1=in.nextInt();
		System.out.print("Enter the Mark 2 :");
		mark2=in.nextInt();
	}
	public void output()
	{
		System.out.print("Mark 1 :"+mark1);
		System.out.print("Mark 2 :"+mark2);
	}
}
