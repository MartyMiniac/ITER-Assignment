//Write program to demonstrate the use of class, public, private, static key word of java. 
package mypack;

public class a1q2p2
{
	public static void main(String args[])
	{
		//same package different class
		a1q2p1 ob = new a1q2p1();
		System.out.println(ob.public_Value);
		
		//This one is not accessible
		//System.out.println(ob.private_Value);
		
		//Accessible
		System.out.println(ob.protected_Value);
		System.out.println(ob.default_Value);
	}
}
