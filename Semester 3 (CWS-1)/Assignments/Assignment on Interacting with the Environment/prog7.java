import java.util.*;
public class prog7
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your Username : ");
		String userinput=in.nextLine();
		in.close();
		String username=System.getProperty("user.name");
		if(username.equals(userinput))
		{
			System.out.print("Correct Username");
		}
		else
		{
			System.out.println("Incorrect Username");
		}
	}
}
