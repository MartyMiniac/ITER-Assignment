import java.util.*;
public class prog5
{
	public static void main(String args[])
	{
		Properties p =System.getProperties();
		System.out.println("Path Separator using Object = "+p.getProperty("path.separator"));
		System.out.println("Path Separator = "+System.getProperty("path.separator"));
	}
}
