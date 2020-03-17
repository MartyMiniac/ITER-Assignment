import java.util.Scanner;
public class a3q15 
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a String :");
		String s=in.nextLine();
		String ans=rev(s);
		System.out.println(ans);
	}
	public static String rev(String s)
	{
		if(s.length()==0)
			return "";
		else
			return s.charAt(s.length()-1)+rev(s.substring(0,s.length()-1));
	}
}
