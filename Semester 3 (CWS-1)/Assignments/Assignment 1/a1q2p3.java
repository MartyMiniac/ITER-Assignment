//Write program to demonstrate the use of class, public, private, static key word of java. 
import mypack.*;
public class a1q2p3 extends a1q2p1
{
	public static void main(String args[])
	{
		//Different Package using Subclass
		a1q2p3 ob = new a1q2p3();
		ob.display();
	}
	void display()
	{
		//Not accessible
		//System.out.println(private_Value);
		//System.out.println(default_Value);
		
		//Accessible
		System.out.println(protected_Value);
		System.out.println(public_Value);
	}
}
