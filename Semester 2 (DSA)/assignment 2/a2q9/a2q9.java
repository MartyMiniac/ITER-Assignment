package a2q9;
import mypack1.*;
import mypack2.*;
public class a2q9 implements Sports
{
	public static void main(String args[])
	{
		Test ob = new Test();
		ob.input();
		int t=ob.mark1+ob.mark2+score1+score2;
		System.out.println("Grand Total ="+t);
	}
}
