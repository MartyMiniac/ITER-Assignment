//Write program to demonstrate the use of class, public, private, static key word of java. 

import mypack.*;
public class a1q2p4
{
	public static void main(String args[])
	{
		//Different Package
		a1q2p1 ob = new a1q2p1();
		
		//Not Accessible
		//System.out.println(ob.private_Value);
		//System.out.println(ob.protected_Value);
		//System.out.println(ob.default_Value);
		
		//Accessible
		System.out.println(ob.public_Value);
	}
}
