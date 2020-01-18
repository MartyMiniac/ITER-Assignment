import java.util.Scanner;
class a3q13
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter month :");
		int a=in.nextInt();
		System.out.print("Enter year :");
		int b=in.nextInt();
		switch(a)
		{
		case 1:
			System.out.print("January "+b+" has 31 days");
			break;
		case 2:
			if(b%4==0 && (b%100!=0 || b%400!=0))
			System.out.print("Febuary "+b+" has 29 days");
			else
			System.out.print("Febuary "+b+" has 28 days");
			break;
		case 3:
			System.out.print("March "+b+" has 31 days");
			break;
		case 4:
			System.out.print("April "+b+" has 30 days");
			break;
		case 5:
			System.out.print("May "+b+" has 31 days");
			break;
		case 6:
			System.out.print("June "+b+" has 30 days");
			break;
		case 7:
			System.out.print("July "+b+" has 31 days");
			break;
		case 8:
			System.out.print("August "+b+" has 31 days");
			break;
		case 9:
			System.out.print("September "+b+" has 30 days");
			break;
		case 10:
			System.out.print("October "+b+" has 31 days");
			break;
		case 11:
			System.out.print("Novermber "+b+" has 30 days");
			break;
		case 12:
			System.out.print("December "+b+" has 31 days");
			break;
		}
	}
}
