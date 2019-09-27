import java.util.*;
class a2q12
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int inp, g, d, l;
		System.out.print("Enter the number of eggs :");
		inp=in.nextInt();
		g=inp/144;
		inp=inp%144;
		d=inp/12;
		inp=inp%12;
		l=inp;
		System.out.print("Your number of eggs are "+g+" gross, "+d+" dozen, and "+l+".");
	}
}