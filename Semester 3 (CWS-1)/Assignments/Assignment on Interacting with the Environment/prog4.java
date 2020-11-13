import java.io.*;
public class prog4
{
	public static void main(String args[])
	{
		PrintWriter fs=null;
		try
		{
			fs = new PrintWriter(new File("nul"));
		}
		catch(FileNotFoundException e)
		{
			System.err.println("Null Device not found !!");
		}
		fs.print("This is a Test File");
		fs.close();
	}
}
