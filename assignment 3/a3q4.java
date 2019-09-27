import java.util.Scanner;
class a3q4
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Charecter:");
		char ch=in.nextLine().charAt(0);
		int a=(int)ch;
		if(65<=ch && 90>=ch)
			System.out.print(ch+" is Capital Letter");
		else if(97<=a && 122>=a)
			System.out.print(ch+" is Small Letter");
		else if(48<=a && 57>=a)
			System.out.print(ch+" is a Numeral");
		else
			System.out.print(ch+" is a Special Character");
	}
}