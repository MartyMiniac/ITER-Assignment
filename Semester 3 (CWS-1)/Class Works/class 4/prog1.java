import java.util.StringTokenizer;

public class prog1
{
	public static void main(String args[])
	{
		StringTokenizer ob = new StringTokenizer("Hello World of Java");
		while(ob.hasMoreTokens())
		{
			System.out.println(ob.nextToken());
		}
		System.out.println("---------------------------------");
		
		ob = new StringTokenizer("Hello, World| of| Java","|");
		while(ob.hasMoreTokens())
		{
			System.out.println(ob.nextToken());
		}
		System.out.println("---------------------------------");
		
		ob = new StringTokenizer("Hello, World|of|Java","|",true);
		while(ob.hasMoreTokens())
		{
			System.out.println(ob.nextToken());
		}
	}
}
