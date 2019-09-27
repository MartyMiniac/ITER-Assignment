import java.util.*;
class a2q13
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Mins :");
		long m, d, y;
		m=in.nextLong();
		d=m/60;
		d=d/24;
		y=d/365;
		d=d%365;
		System.out.println(m+" minutes is approximately "+y+" years and "+d+" days");
	}
}