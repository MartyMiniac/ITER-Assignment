
public class prog2
{
	public static void main(String args[])
	{
		StringBuilder s1 = new StringBuilder("Hello");
		s1.append(" Java");
		System.out.println(s1);
		
		System.out.println("-------------------------------------------------");
		
		StringBuilder s2 = new StringBuilder("Hello");
		s2.insert(1,"Java");
		System.out.println(s2);
		System.out.println("-------------------------------------------------");
		
		StringBuilder s3 = new StringBuilder("Hello");
		s3.replace(1,3,"Java");
		System.out.println(s3);
		System.out.println("-------------------------------------------------");
		
		StringBuilder s4 = new StringBuilder("Hello");
		s4.deleteCharAt(1);
		System.out.println(s4);
		System.out.println("-------------------------------------------------");
		
		StringBuilder s5 = new StringBuilder("Hello");
		s5.reverse();
		System.out.println(s5);
	}
}
