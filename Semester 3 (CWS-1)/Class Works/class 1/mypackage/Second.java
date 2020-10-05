//Write a Program to demonstrate the use of more than one classes in separate packages.

package mypackage;

import newpackage.diffpack;

public class Second
{
	public static void main(String args[])
	{
		System.out.println("This is Second Class");
		diffpack ob = new diffpack();
		ob.show();
	}
}
