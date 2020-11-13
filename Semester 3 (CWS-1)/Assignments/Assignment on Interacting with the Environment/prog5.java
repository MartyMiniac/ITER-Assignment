/*Write a program which read a path to a file as a string and modify the
string according to system specify file seperator and display it.*/
import java.util.*;

public class prog5
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a File Path : ");
		String path=in.nextLine();
		in.close();
		path=path.replace('/', System.getProperty("file.separator").charAt(0));
		System.out.println(path);
	}
}
