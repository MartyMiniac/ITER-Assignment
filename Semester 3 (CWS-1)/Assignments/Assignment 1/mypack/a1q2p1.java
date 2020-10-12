//Write program to demonstrate the use of class, public, private, static key word of java. 

package mypack;

public class a1q2p1 {
	public String public_Value="I am Public";
	protected String protected_Value="I am Protected";
	String default_Value="I am Default";
	private String private_Value="I am Private";
	public static void main(String args[])
	{
		//same class
		a1q2p1 ob = new a1q2p1();
		ob.method();
	}
	void method()
	{
		//Accessible
		System.out.println(public_Value);
		System.out.println(private_Value);
		System.out.println(protected_Value);
		System.out.println(default_Value);
	}
}
