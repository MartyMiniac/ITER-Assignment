import java.util.Scanner;
class a3q8
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter age of Rahul, Ayush, Ajay");
		double rh=in.nextDouble();
		double ay=in.nextDouble();
		double aj=in.nextDouble();
		double m=Math.max(Math.max(rh, ay), Math.max(ay, aj));
		if(m==rh)
			System.out.print("Rahul is Eldest");
		if(m==ay)
			System.out.print("Ayush is Eldest");
		if(m==aj)
			System.out.print("Ajay is Eldest");
	}
}