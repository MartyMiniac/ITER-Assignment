//Write a program to demonstrate the working of splitting a text by a given pattern.
public class prog5
{
	public static void main(String args[])
	{
		String s="CSE1ECE2EEE3CIVIL";
		String arr[] = s.split("\\d");
		for(String t :arr)
		{
			System.out.println(t);
		}
	}
}
