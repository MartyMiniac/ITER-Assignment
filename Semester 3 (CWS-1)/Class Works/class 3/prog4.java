public class prog4
{
	public static void main(String args[])
	{
		String s =System.getProperty("user.dir")+System.getProperty("file.separator")+"File1";
		System.out.println("My File Seperator : "+System.getProperty("file.separator"));
		System.out.println(s);
	}
}
