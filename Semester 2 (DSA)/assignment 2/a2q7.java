import java.util.*;
interface inter
{
	public void display();
	public void count();
}
class prog7 implements inter
{
	static int maxcount;
	String name;
	prog7(String name, int maxcount)
	{
		this.name=name;
		this.maxcount=maxcount;
	}
	public void display()
	{
		System.out.println("Name = "+name);
		System.out.println("Max Count = "+maxcount);
	}
	public void count()
	{
		
	}
}
public class a2q7
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Name of the Person : ");
		String name=in.nextLine();
		System.out.print("Enter the Max Count : ");
		int maxcount=in.nextInt();
		prog7 ob = new prog7(name, maxcount);
		ob.display();
	}
}