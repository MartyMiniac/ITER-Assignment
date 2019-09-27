import java.util.*;
class a3q18
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("What is your Gender (M of F)");
		char ch=in.nextLine().charAt(0);
		boolean g,m=false;
		switch(ch)
		{
		case 'M':
			g=true;
			break;
		case 'F':
			g=false;
			break;
		default:
			System.out.println("Invalid Input, You will be considered Male");
			g=true;
		}
		String fname, lname;
		System.out.print("Enter Your First Name : ");
		fname=in.nextLine();
		System.out.print("Enter Your Last Name  : ");
		lname=in.nextLine();
		System.out.print("Age : ");
		int age=in.nextInt();
		in.nextLine();
		if(age>20)
			m=true;
		if(age>20 && g==false)
		{
			System.out.print("Are you Married, "+fname+" (y or n)? :");
			String tmp=in.nextLine();
			ch=tmp.charAt(0);
			switch(ch)
			{
			case 'y':
				m=true;
				break;
			case 'n':
				m=false;
				break;
			default:
				System.out.println("Invalid Input, you will be considered Unmarried");
				m=false;
			}
		}
		String outp="Then I shall call you ";
		if(m==true && g==true)
			outp=outp+"Mr. ";
		if(m==true && g==false)
			outp=outp+"Mrs. ";
		if(m==false && g==false)
			outp=outp+"Ms. ";
		outp=outp+fname+" "+lname;
		System.out.print(outp);
	}
}